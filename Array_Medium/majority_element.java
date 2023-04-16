package Array_Medium;

public class majority_element {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 0;

        for(int num : nums){
            if(count == 0){
                count++;
                major = num;
            }else if(num == major){
                count++;
            }else{
                count--;
            }
        }

        return major;
    }
}
