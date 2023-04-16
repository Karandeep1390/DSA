package BS_Answer_InSearchSpace;

public class Koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        for(int pile : piles){
            max = Math.max(pile, max);
        }
        int low = 0;
        int high = max;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(piles,h,mid)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int [] arr,int hours, int rate) {
        int hours_with_this_rate = 0;

        for(int a : arr){
            hours_with_this_rate += (int)(Math.ceil((a * 1.0 )/ rate));
        }

        return hours_with_this_rate <= hours;
    }
}
