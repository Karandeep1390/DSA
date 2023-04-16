//import java.text.NumberFormat.Style;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Juspay {
    static Node buildTree(Node root, int m, List<String> list){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int st = 1;

        while(q.isEmpty()){
            Node node = q.poll();

            if(st > list.size()) continue;

            List<String> temp = new ArrayList<>();
            for(int i=st;i<st+m;i++){
                temp.add(list.get(i));
            }

            //((Object) node).addLinks(temp, node);
            st+=m;

            for(Node child : node.links){
                q.add(child);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        /*
	 * INPUT
	 * n = total number of nodes
	 * m = number of child per node
	 * q = number of queries
	 *
	 * next 'n' lines = node name in string
	 * next 'q' lines = queries with (opcode, string, uid)
	 *
	 * opcode => 1 = Lock, 2 = Unlock, 3 = Upgrade
	*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }

        Node root = new Node();
        root = buildTree(root, m, list);
        Tree t = new Tree(root);
        t.fillVton(root);

        for(int i=0;i<q;i++){
            String s = sc.next();
            String [] parts = s.split(" ");
            int op = Integer.parseInt(parts[0]);
            String v = parts[1];
            int uid = Integer.parseInt(parts[2]);

            switch (op) {
                case 1:
                    if(t.lock(v, uid)){
                        System.out.println(true);
                    }else{
                        System.out.println(false);
                    }
                    break;
                case 2:
                    if(t.unlock(v, uid)){
                        System.out.println(true);
                    }else{
                        System.out.println(false);
                    }
                    break;
                case 3:
                    if(t.upgrade(v, uid)){
                        System.out.println(true);
                    }else{
                        System.out.println(false);
                    }
                    break;   
            }
        }
        sc.close();

    }
}



class Tree{
    Node root;
    HashMap<String,Node> vTon;

    Tree(Node r){
        this.root = r;
        vTon = new HashMap<>();
    }

    void fillVton(Node r){
        if(r == null) return;

        vTon.put(r.v, r);
        for(Node node : r.links){
            fillVton(node);
        }
    }

    void informDecendants(Node r, int val){
        for(Node k: r.links){
            //k.data += val;
            informDecendants(k,val);
        }
    }

    boolean verifyDescendants(Node r, int id, List<Node> v){
        if(r.isLocked){
            if(r.uid != id) return false;
            v.add(r);
        }

        if(r.dec_locked == 0) return false;

        boolean ans = true;
        for(Node node : r.links){
            ans &= verifyDescendants(node, id, v);
            if(ans == false) return false;
        }

        return ans;
    }

    boolean lock(String v, int id){
        Node t = vTon.get(v);
        if(t.isLocked) return false;

        //if(t.data != 0) return false;
        if(t.dec_locked != 0) return false;

        Node cur = t.parent;
        while(cur != null){
            cur.dec_locked++;
            cur = cur.parent;
        }
        informDecendants(t,1);
        t.isLocked = true;
        t.uid = id;
        return true;
    }

    boolean unlock(String v, int id){
        Node t = vTon.get(v);
        if(!t.isLocked) return false;
        if(t.isLocked && t.uid != id) return false;

        Node cur = t.parent;
        while(cur != null){
            cur.dec_locked--;
            cur = cur.parent;
        }
        informDecendants(t,-1);
        t.isLocked = false;
        return true;
    }

    boolean upgrade(String v, int id){
        Node t = vTon.get(v);
        if(t.isLocked) return false;

        //if(t.data != 0) return false;
        if(t.dec_locked == 0) return false;

        List<Node> vec = new ArrayList<>();
        if(verifyDescendants(t,id,vec)){
            for(Node k : vec){
                unlock(k.v,id);
            }
        }else return false;
        lock(v,id);
        return true;
    }
}
