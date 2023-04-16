package Greedy;

import java.util.*;

public class MinNumberOfCoins {
    static List<Integer> minPartition(int N)
    {
        // code here
        int [] arr = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        int amount = N;
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=arr.length-1;i>=0;i--){
            int note = arr[i];
            
            while(amount >= note){
                amount -= note;
                ans.add(note);
            }
        }
        
        return ans;
    }
}
