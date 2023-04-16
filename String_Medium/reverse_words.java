package String_Medium;

public class reverse_words {
    public String reverseWords(String s) {
        String[] parts = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
            sb.append(parts[i]);
            if(i!=0)sb.append(" ");
        }
        return sb.toString();
    }
}
