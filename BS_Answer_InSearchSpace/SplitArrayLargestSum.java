package BS_Answer_InSearchSpace;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int min = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums){
            min = Math.max(min,num);
            sum += num;
        }

        int left = min;
        int right = sum;
        int ans = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(isGoodSplit(nums,k,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return ans;
    }

    private boolean isGoodSplit(int [] nums, int k, int mid){
        int sum = 0;
        int count = 1;

        for(int num : nums){
            if(sum + num > mid){
                count++;
                sum = num;
            }else{
                sum += num;
            }
        }

        return count <= k;
    }
}
