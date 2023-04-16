package Greedy.Greedy_Medium;

import java.util.*;

public class merge_interval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a1,a2)->Integer.compare(a1[0],a2[0]));

        ArrayList<int []> ans = new ArrayList<>();

        int idx = 0;

        while(idx < intervals.length){
            if(ans.size() == 0 || ans.get(ans.size()-1)[1] < intervals[idx][0]){
                ans.add(intervals[idx]);
            }else{
                int [] lastInterval = ans.get(ans.size()-1);
                lastInterval[1] = Math.max(lastInterval[1],intervals[idx][1]);
            } 
            idx++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
