package Greedy.Greedy_Medium;

import java.util.Arrays;

public class Job_Scheduling_Program {
    static int[] JobScheduling(Job arr[], int n){
        // Your code here
        Arrays.sort(arr,(a,b)->(b.profit - a.profit));

        int maxi = Integer.MIN_VALUE;
        for(Job a : arr){
            maxi = Math.max(a.deadline, maxi);
        }

        int [] deadline = new int[maxi+1];
        for(int i=1;i<=maxi;i++){
            deadline[i] = -1;
        }
        int totalProfit = 0;
        int countJobs = 0;

        for(int i=0;i<arr.length;i++){
            Job job = arr[i];
            for(int j=job.deadline;j>=1;j--){
                if(deadline[j] == -1){
                    deadline[j] = job.id;
                    totalProfit += job.profit;
                    countJobs++;
                    break;
                }
            }
        }

        int [] ans = new int[2];
        ans[0] = countJobs;
        ans[1] = totalProfit;

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        Job [] arr = new Job[n];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 1, 40);
        arr[3] = new Job(4, 1, 30);

        int [] ans = JobScheduling(arr, n);
        System.out.println(ans[0] + " "+ans[1]);
    }
}
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
