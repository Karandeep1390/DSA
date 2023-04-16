package Greedy.Greedy_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maximum_meetings {
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        List<Meeting> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new Meeting(i, start[i], end[i]));
        }

        Collections.sort(l);

        int count = 1;
        Meeting m1 = l.get(0);
        for(int i=1;i<n;i++){
            if(m1.end < l.get(i).start){
                count++;
                m1 = l.get(i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [] start = {1 ,3 ,0 ,5 ,8 ,5};
        int [] end = {2, 4, 6, 7, 9, 9};
        int n = 6;

        System.out.println(maxMeetings(start, end, n));
    }
}
class Meeting implements Comparable<Meeting> {

    int i;
    int start;
    int end;

    Meeting(int i, int start,int end){
        this.i = i;
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting m1) {
        return Integer.compare(m1.end, this.end);
    }
    
}
