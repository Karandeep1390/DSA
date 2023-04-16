package Array_Medium;
import java.util.HashMap;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            Integer diff = (Integer)(target-nums[i]);
            
            if(map.containsKey(diff)){
                int [] ans = {map.get(diff),i};
                return ans;
            }
            
            map.put(nums[i],i);
        }
        
        return null;
    }
}
