package Sliding_Window_and_Two_Pointer_Hard;

import java.util.HashMap;

public class minimum_window_substring {
    public String minWindow(String s, String t){
        HashMap<Character,Integer> mapt = new HashMap<>();

        for(char c : t.toCharArray()){
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> maps = new HashMap<>();

        int start = 0;
        int end = 0;
        int mct = 0;

        int minLength = Integer.MAX_VALUE;
        int min_start = 0;

        while(end < s.length()){
            char ch = s.charAt(end);

            if(mapt.containsKey(ch)){
                if(maps.containsKey(ch)){
                    if(mapt.get(ch) > maps.get(ch)){
                        mct++;
                    }
                    maps.put(ch, maps.get(ch)+1);
                }else{
                    mct++;
                    maps.put(ch, 1);
                }
            }

            end++;

            while(mct == t.length()){
                if(end - start < minLength){
                    minLength = end - start;
                    min_start = start;
                }

                char chs = s.charAt(start);
                if(mapt.containsKey(chs)){
                    if(mapt.get(chs) > maps.get(chs)){
                        maps.put(chs,maps.get(chs)-1);
                    }else{
                        mct--;
                        maps.put(chs,maps.get(chs)-1);
                    }
                }

                start++;
            }
        }

        if(minLength == 0){
            return "";
        }

        return s.substring(min_start, min_start + minLength);
    }
}
