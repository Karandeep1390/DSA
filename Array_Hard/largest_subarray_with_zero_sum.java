package Array_Hard;

import java.util.HashMap;

public class largest_subarray_with_zero_sum {
    int maxLen(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum =  0;
        int max_len = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum == 0){
                max_len = Math.max(max_len, i+1);
            }

            if(map.containsKey(sum)){
                int index = map.get(sum);
                int len = i - index;
                max_len = Math.max(max_len, len);
            }else{
                map.put(sum, i);
            }
        }

        return max_len;
    }
}
