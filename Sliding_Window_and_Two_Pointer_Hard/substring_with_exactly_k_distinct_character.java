package Sliding_Window_and_Two_Pointer_Hard;

import java.util.HashMap;

public class substring_with_exactly_k_distinct_character {
    public static int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;

        int maxlen = 0;

        while(end < s.length()){
            char che = s.charAt(end);

            map.put(che,map.getOrDefault(che, 0) + 1);

            while(map.size() > k){
                char chs = s.charAt(start);
                map.put(chs,map.get(chs)-1);
                if(map.get(chs) == 0){
                    map.remove(chs);
                }

                start++;
            }

            if(map.size() == k && maxlen < (end-start+1)){
                maxlen = end-start+1;
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        System.out.println(longestkSubstr(s, k));
    }
}
