package String_Medium;

import java.util.HashMap;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = map.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            int val1 = map.get(s.charAt(i));
            int val2 = map.get(s.charAt(i+1));

            if(val1 < val2){
                n = n - val1;
            }else{
                n = n + val1;
            }
        }

        return n;
    }
}
