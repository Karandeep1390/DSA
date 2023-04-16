package Array_Medium;

public class Kadane {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int prefix_sum = 0;
        for(int num : nums){
            prefix_sum = Math.max(prefix_sum + num, num);

            max_sum = Math.max(prefix_sum, max_sum);
        }

        return max_sum;
    }
}
