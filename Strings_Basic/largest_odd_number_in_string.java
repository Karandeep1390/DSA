package Strings_Basic;

import java.util.*;

public class largest_odd_number_in_string {
    public String largestOddNumber(String num) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('1', '3', '5', '7', '9'));
        for(int i=num.length()-1;i>=0;i--){
            if(set.contains(num.charAt(i))){
                return num.substring(0,i+1);
            }
        }
        
        return "";
    }
}
