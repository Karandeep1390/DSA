package Stack;

import java.util.Stack;

public class Remove_duplicates_in_String_Two {
    public String removeDuplicates(String s, int k) {
        Stack<Node> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(st.isEmpty() || st.peek().c != c){
                st.push(new Node(c, 1));
            }else if(st.peek().c == c){
                st.peek().count++;
            }

            if(st.peek().count == k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(Node node : st){
            sb.append(node.c);
        }

        return sb.toString();
    }

    class Node{
        char c;
        int count;
        
        Node(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }
}
