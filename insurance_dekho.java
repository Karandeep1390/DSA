import java.util.*;

public class insurance_dekho {
    public static void main(String[] args) {
       Node root = new Node();
       int data = 45;

       ArrayList<Node> nrp = new ArrayList<>();

       nrp_helper(root,data,nrp);

       

    }

    public static boolean nrp_helper(Node node,int data,ArrayList<Node> nrp){
        if(node.data == data){
            nrp.add(node);
            return true;
        }

        boolean t = false;

        for(Node child : node.nodes){
            t = nrp_helper(child, data, nrp);
            if(t) return true;
        }
        return t;

        

    }
}

class Node{
    int data;
    List<Node> nodes;
    public Node[] links;
    public boolean isLocked;
    public int dec_locked;
    public int uid;
    public Node parent;
    public String v;
}
//let arr = [10, 2, -2, 2, -8, 7, 2, 10, 2]
// no-range
// unsorted
// random
// repeated

// function findYourLuckyNumber(array) {
//     // write your code here

//     return <LUCKY_NUMBER>;    
// }

// [
//     {employeeCode: 20, managerCode: 30},
//     {employeeCode: 30, managerCode: 40},
//     {employeeCode: 40},
//     {employeeCode: 50, managerCode: 40},
// ]
