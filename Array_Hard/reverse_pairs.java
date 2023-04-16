package Array_Hard;

import java.util.ArrayList;

public class reverse_pairs {
    public int reversePairs(int[] nums) {
        return merge_sort(nums,0,nums.length-1);
    }

    private int merge_sort(int[] nums, int low, int high) {
        int inv_count = 0;
        if(low >= high) return inv_count;

        int mid = (high + low)/2;

        inv_count += merge_sort(nums, low, mid);
        inv_count += merge_sort(nums, mid+1, high);

        inv_count += merge(nums,low,mid,high);

        return inv_count;
    }

    private int merge(int[] nums, int low, int mid, int high) {
        int cnt = 0;

        int j = mid+1;

        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i] > (2 * (long) nums[j])) j++;
            cnt += (j-(mid+1));
        }

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add( nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }

        while(left <= mid){
            temp.add(left++);
        }
        while(right <= high){
            temp.add(right++);
        }

        for(int i=low;i<=high;i++){
            nums[i] = temp.get(i-low);
        }

        return cnt;
    }
}
