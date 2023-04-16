package Stack;

import java.util.Stack;

public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";
    
        Stack<Character> st = new Stack<>();

        for(char ch : num.toCharArray()){
            while(k > 0 && !st.isEmpty() && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(k > 0 && !st.isEmpty()) st.pop();

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        sb.reverse();

        while(sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        
        return sb.toString();
    }
}
