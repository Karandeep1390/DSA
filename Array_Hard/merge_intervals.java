package Array_Hard;

import java.util.*;

public class merge_intervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        List<int []> ans = new ArrayList<>();

        Arrays.sort(intervals, (i1,i2)->Integer.compare(i1[0], i2[0]));

        int [] newInterval = intervals[0];
        ans.add(newInterval);

        for(int [] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }else{
                ans.add(interval);
                newInterval = interval;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
