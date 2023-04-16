package Dp;

import java.util.Scanner;

public class longest_palindromic_substring {
    public static int lonegestPalindrome(String s) {
        int n = s.length();

        boolean [][] dp = new boolean[n][n];
        int maxLen = Integer.MIN_VALUE;

        for(int g =0;g<n;g++){
            for(int i=0,j=0;j<n;i++,j++){
                if(g==0){
                    dp[i][j] = true; 
                }else if(g == 1){
                    dp[i][j] = (s.charAt(i) == s.charAt(j) ? true : false);
                }else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) ? dp[i+1][j-1] : false);
                }

                if(dp[i][j]){
                    maxLen = Math.max(maxLen,g+1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 100;
        int counter = 1;

        for(int i=0;i<n;i++){
            if(i % 2 == 1){
                int b = a;
                for(int j=0;j<=counter;j++){
                    if(j < counter){
                        System.out.print(b + " ");
                    }else{
                        System.out.println(b);
                    }
                    b += a;
                }
                counter++;
            }else{
                a+=100;
                System.out.println(a);
            }
        }

        sc.close();
    }
}
