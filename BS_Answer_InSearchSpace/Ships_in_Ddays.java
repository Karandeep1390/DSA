package BS_Answer_InSearchSpace;

public class Ships_in_Ddays {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int ans = -1;
        int sum = 0;

        for(int w : weights){
            max = Math.max(max, w);
            sum += w;
        }

        int lo = max;
        int hi = sum;

        if(days == weights.length){
            return lo;
        }

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;

            if(isPossible(weights,days,mid)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] weights, int days, int mid) {
        int sum = 0;
        int d = 1;
        for(int w : weights){
            sum += w;
            if(sum > mid){
                d++;
                sum = w;
            }
        }

        return d <= days;
    }
    public static void main(String[] args) {
        System.out.println(2/4);
    }
}
