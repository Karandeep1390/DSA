package Strings_Basic;

import java.util.Arrays;
import java.util.Collections;

public class reverse_words_in_a_String {
    public String reverseWords(String s) {
        String[] parts = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
            sb.append(parts[i]);
            if(i!=0)sb.append(" ");
        }
        return sb.toString();
    }

    public String reverseWordsEfficient(String s) {
        String[] parts = s.trim().split(" +");
        Collections.reverse(Arrays.asList(parts));
        return String.join(" ", parts);
    }
}
