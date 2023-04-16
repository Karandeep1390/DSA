package Array_Basic;

public class remove_duplicates_sorted_array {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        int insertPos = 0;

        for(int i=1;i<len;i++){
            if(nums[i] != nums[insertPos]) nums[++insertPos] = nums[i];
        }

        return insertPos+1;
    }
}
