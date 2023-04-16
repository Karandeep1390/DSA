package String_Medium;

public class Beauty_sum {
    public static int beautySum(String s) {
        int ans = 0;

        for(int size = 3; size <= s.length();size++){
            int i = 0;
            int j = size;
            int [] freq = new int[26];
            for(int k=i;k<j;k++){
                freq[s.charAt(k)-'a']++;
            }
            System.out.println(s.substring(i, j));
            ans += beauty(freq);
            
            while(j < s.length()){
                freq[s.charAt(j)-'a']++;
                freq[s.charAt(i) - 'a']--;
                ans += beauty(freq);
                System.out.println(s.substring(i, j));
                j++;
                i++;
            }
        }

        return ans;
    }

    private static int beauty(int[] freq) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : freq){
            if(i!=0){
                min = Math.min(i, min);
                max = Math.max(max, i);
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));
    }
}
