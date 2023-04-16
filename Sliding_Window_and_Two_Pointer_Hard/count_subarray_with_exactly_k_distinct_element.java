package Sliding_Window_and_Two_Pointer_Hard;

import java.util.HashMap;

public class count_subarray_with_exactly_k_distinct_element {
    public static int subarraysWithKDistinct(int[] nums, int k) {

        return subarraysWithKSize(nums, k) - subarraysWithKSize(nums, k - 1);
      }

    private static int subarraysWithKSize(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int start = 0;
        int countSubarray = 0;

        for(int end = 0;end<nums.length;end++){
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while(map.size() > k){
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start]) == 0){
                    map.remove(nums[start]);
                }
                start++;
            }

            countSubarray += end - start + 1;
        }

        return countSubarray;
    }

    public static void main(String[] args) {
        
    }
}
