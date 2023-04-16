package Two_Pointer_Medium;

import java.util.HashMap;

public class length_of_longest_substring_without_repeating_charater {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 1;

        for(int i=0,j=0;i<s.length();i++){
            char chi = s.charAt(i);

            while(map.containsKey(chi)){
                char chj = s.charAt(j);
                map.put(chj, map.get(chj)-1);

                if(map.get(chj) <= 0){
                    ans = Math.max(ans, i-j);
                    map.remove(chj);
                }

                j++;
            }
            
            map.put(chi, map.getOrDefault(chi, map.getOrDefault(chi, 0)+1));
        }

        return Math.max(ans, map.size());
    }
}
