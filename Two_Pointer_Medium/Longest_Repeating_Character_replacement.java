package Two_Pointer_Medium;

import java.util.HashMap;
import java.util.Map;

public class Longest_Repeating_Character_replacement {
    public int characterReplacement(String s, int k){
        Map<Character,Integer> map = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        int maxCountofRepeatingCharacter = 0;

        for(int end = 0;end < s.length();end++){
            char right = s.charAt(end);

            map.put(right, map.getOrDefault(right, 0) + 1);
            maxCountofRepeatingCharacter = Math.max(maxCountofRepeatingCharacter, map.get(right));

            if(end - start + 1 - maxCountofRepeatingCharacter > k){
                char left = s.charAt(start);
                map.put(left, map.get(left)-1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
