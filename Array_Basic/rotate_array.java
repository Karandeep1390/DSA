package Array_Basic;

public class rotate_array {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(0,n,nums);
        reverse(0,k,nums);
        reverse(k,n,nums);
        
    }

    public void reverse(int i,int j,int [] nums){
        int left = i;
        int right = j-1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
    }
}
