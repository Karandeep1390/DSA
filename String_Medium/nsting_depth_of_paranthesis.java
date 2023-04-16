package String_Medium;

public class nsting_depth_of_paranthesis {
    public int maxDepth(String s) {
        int depth = 0;
        int open = 0;

        for(char c : s.toCharArray()){
            if(c == '(') open++;
            if(c == ')') open--;

            depth = Math.max(open,depth);
        }

        return depth;
    } 
}
