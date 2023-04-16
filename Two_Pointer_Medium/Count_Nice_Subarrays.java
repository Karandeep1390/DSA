package Two_Pointer_Medium;

import java.util.HashMap;
import java.util.Map;

public class Count_Nice_Subarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int curr = 0;

        for(int num : nums){
            curr += num % 2;
            count += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums, k));
    }
}
