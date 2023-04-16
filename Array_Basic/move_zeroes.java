package Array_Basic;

public class move_zeroes {
    public static void moveZeroes(int[] nums) {
        int curr_i = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[curr_i++] = nums[i];
            }
        }
        for(int i=curr_i;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
