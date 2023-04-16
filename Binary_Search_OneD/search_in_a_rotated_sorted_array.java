package Binary_Search_OneD;

public class search_in_a_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(nums[mid] == target){
                return mid;
            }else if((nums[mid]==nums[lo])&&(nums[hi]==nums[mid])){
                 lo++;
                 hi--;
            }
            else if(nums[lo] <= nums[mid]){
                if(nums[lo] <= target && nums[mid] > target){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else if(nums[mid] <= nums[hi]){
                if(nums[mid] < target && nums[hi] >= target){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }

        return -1;
    }
}
