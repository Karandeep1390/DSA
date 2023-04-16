package Greedy.Greedy_Medium;

import java.util.ArrayList;

public class Insert__Interval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int idx = 0;

        ArrayList<int []> ans = new ArrayList<>();

        while(idx < intervals.length){
            if(intervals[idx][0] < newInterval[0]){
                ans.add(intervals[idx]);
                idx++;
            }else{
                break;
            }
        }

        if(ans.size() == 0 || newInterval[0] > ans.get(ans.size()-1)[1]){
            ans.add(newInterval);
        }else{
            int [] lastInterval = ans.get(ans.size()-1);
            lastInterval[1] = Math.max(lastInterval[1], newInterval[1]);
        }

        while(idx < intervals.length){
            int [] lastInterval = ans.get(ans.size()-1);
            if(lastInterval[1] >= intervals[idx][0]){
                //merging
                lastInterval[1] = Math.max(lastInterval[1], intervals[idx][1]);
            }else{
                ans.add(intervals[idx]);
            }
            idx++;
        }

        return ans.toArray(new int [ans.size()][]);
    }

    public static void main(String[] args) {
        int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newInterval = {4,8};
        int [][] ans = insert(intervals, newInterval);

        for(int [] a : ans){
            System.out.println(a[0] + " " + a[1]);
        }
    }
}
