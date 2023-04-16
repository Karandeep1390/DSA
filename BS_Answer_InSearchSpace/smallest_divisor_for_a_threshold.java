package BS_Answer_InSearchSpace;

public class smallest_divisor_for_a_threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int ans = -1;

        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }

        int left = min;
        int right = max;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(isPossible(nums,threshold,mid)){
                right = mid-1;
                ans = mid;
            }else{
                left = mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int [] nums, int threshold, int value){
        int sum = 0;

        for(int val : nums){
            sum += (int) Math.ceil((val * 1.0) / value);
        }

        return sum <= threshold;
    }

    
}
