package Greedy.Greedy_Medium;

import java.util.*;

public class non_overlapping_interval {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(i1,i2)->(Integer.compare(i1[1],i2[1])));
        for(int [] interval : intervals){
            System.out.println(interval[0] + " " + interval[1]);
        }
        
        int removed = 0;
        int prevEnd = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int [] interval = intervals[i];
            if(interval[0] < prevEnd){
                removed++;
            }else{
                prevEnd = interval[1];
            }
        }

        return removed;
    }

    public static void main(String[] args) {
        int [][] intervals = {{1,2},{3,5},{8,10},{6,17},{12,16}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
