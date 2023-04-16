package Array_Medium;

public class sort_color {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;

        while(j <= k){
            if(nums[j] == 0){
                nums[j] = nums[i];
                nums[i++] = 0;
            }
            if(nums[j] == 2){
                nums[j] = nums[k];
                nums[k] = 2;
                k--;
                j--;
            }
            j++;
        }
    }
}
