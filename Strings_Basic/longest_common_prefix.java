package Strings_Basic;

import java.util.Arrays;

public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String smallest = strs[0];
        String largest = strs[strs.length -1];
        int i = 0;
        while(i < smallest.length()){
            if(smallest.charAt(i) == largest.charAt(i)) i++;
            else break;
        }

        return i == 0 ? "" : smallest.substring(0, i); 
    }
}
