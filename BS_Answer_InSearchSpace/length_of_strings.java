package BS_Answer_InSearchSpace;

import java.util.Scanner;

public class length_of_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String [] arr = new String[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }

        sc.close();

        int ans =(int) Math.pow(k, n);

        System.out.println(ans);
    }
}
