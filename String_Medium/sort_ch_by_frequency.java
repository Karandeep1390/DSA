package String_Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class sort_ch_by_frequency {
    @SuppressWarnings("unchecked")
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();

        HashMap<Character,Integer> fmap = new HashMap<>();
        int high = -1;
        for(char c : s.toCharArray()){
            fmap.put(c, fmap.getOrDefault(c, 0) + 1);
            high = Math.max(high,fmap.get(c));
        }

        
        
        ArrayList<Character> [] arr = new ArrayList[high];

        for(char c : fmap.keySet()){
            if(arr[fmap.get(c)-1] == null){
                arr[fmap.get(c)-1] = new ArrayList<>();
            }
            int i = fmap.get(c);
            while(i>0){
                arr[fmap.get(c)-1].add(c); 
                i--;
            }
            
        }

        for(int i=high-1;i>=0;i--){
            if(arr[i] != null){
                for(char ch : arr[i]){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("abbbbcddddddddeeeeegffggdwf"));
    }
}
