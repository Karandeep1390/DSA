package Array_Basic;

public class Max_cons_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = Integer.MIN_VALUE;
        int count = 0;

        for(int n : nums){
            if(n == 1){
                count++;
                max_count = Math.max(max_count, count);
            }else{
                count = 0;
            }
        }

        return max_count;
    }
}
