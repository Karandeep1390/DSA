import java.util.ArrayList;
import java.util.List;

public class Node {
    Node parent;
    String v;
	List<Node> links;
	int anc_locked, dec_locked, uid;
	boolean isLocked;

    Node(String v, Node parent){
        this.v = v;
        this.parent = parent;
        links = new ArrayList<>();
    }

    Node(){
        this.parent = null;
    }

    void addLinks(List<String> list, Node parent){
        for(String s : list){
            links.add(new Node(s, parent));
        }
    }
}
