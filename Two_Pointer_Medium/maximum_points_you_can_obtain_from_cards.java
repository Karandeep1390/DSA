package Two_Pointer_Medium;

public class maximum_points_you_can_obtain_from_cards {
    public int maxPoints(int [] nums, int k){
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        maxSum = Math.max(maxSum, sum);

        for(int i=k-1,j=nums.length-1;i>=0;i--,j--){
            sum += nums[j] - nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
