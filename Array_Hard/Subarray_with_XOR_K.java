package Array_Hard;

import java.util.HashMap;
import java.util.Scanner;

public class Subarray_with_XOR_K {
    static int subsetXOR(int arr[], int N, int K) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        int XOR = 0;

        for(int a : arr){
            XOR = XOR ^ a;

            if(map.containsKey(XOR ^ K)){
                count+= map.get(XOR ^ K);
            }

            if(XOR == K) count += 1;

            if(map.containsKey(XOR)) map.put(XOR, map.get(XOR)+1);
            else map.put(XOR,1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int arr [] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(subsetXOR(arr, n, a));
    }
}
