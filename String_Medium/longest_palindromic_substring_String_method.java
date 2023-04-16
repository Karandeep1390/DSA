package String_Medium;

public class longest_palindromic_substring_String_method {
    public static String longestPalindrome(String s) {
        boolean [][] dp = new boolean[s.length()][s.length()];
        int l = -1, r = -1;

        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();j++,i++){
                if(g==0){
                    dp[i][j] = true;
                }else if(g==1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }

                if(dp[i][j]){
                    l = i;
                    r = j;
                }
            }
        }

        return s.substring(l, r+1);
    }

    public static void main(String[] args) {
        String s = "ababc";
        System.out.println(longestPalindrome(s));
    }
}
