package Strings_Basic;

import java.util.*;

public class isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);

            if(map.containsKey(chs)){
                if(map.get(chs) != cht) return false;
            }else{
                if(!map.containsValue(cht)) map.put(chs,cht);
                else return false;
            }
        }

        return true;
    }
}
