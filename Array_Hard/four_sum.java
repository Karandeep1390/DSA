package Array_Hard;

import java.util.*;

public class four_sum {
    public static List<List<Integer>> fourSum(int [] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long remSum = target - nums[j] - nums[i];
                int left = j+1;
                int right = nums.length-1;

                while(left < right){
                    int sum = nums[left]+nums[right];

                    if(sum < remSum) left++;
                    else if(sum > remSum) right--;
                    else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);

                        ans.add(quad);

                        while(left < right && nums[left] == quad.get(2)) ++left;
                        while(left < right && nums[right] == quad.get(3)) --right;
                    }
                }

                while(j+1<nums.length && nums[j+1] == nums[j] ) j++;
            }

            while(i+1<nums.length && nums[i+1] == nums[i]) i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = 294967296;
        System.out.println(fourSum(nums, target));
    }
}
