package Array_Hard;

import java.util.*;

public class K_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return ksum(nums,0,4,target);
    }

    private List<List<Integer>> ksum(int[] nums, int start, int k, int target) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        if(k == 2){
            int left = start;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    List<Integer> path = new ArrayList<>();
                    path.add(nums[left]);
                    path.add(nums[right]);
                    res.add(path);

                    while(left<right && nums[left] == nums[left+1])left++;
                    while(right>left && nums[right] == nums[right-1])right--;
                    left++;
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    right++;
                }
            }
        }else{
            for(int i=start;i<len-(k-1);i++){
                if(i!=start && nums[i] == nums[i-1])i++;
                List<List<Integer>> temp = ksum(nums, i+1, k-1, target-nums[i]);
                for(List<Integer> t: temp){
                    t.add(nums[i]);
                }
                res.addAll(temp);   
            }
        }

        return res;
    }
}
