package Array_Basic;

public class missing_number {
    public static int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1))/2;
        int arr_sum = 0;
        for(int a : nums){
            arr_sum += a;
        }
        return sum - arr_sum;
    }
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
