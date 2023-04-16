package BinarySearch2D;

public class Median_2d {
    int median(int matrix[][], int R, int C) {
        // code here
        int low = 1;
        int high = (int) 1e9;
        
        while(low <= high){
            int mid = (low+high) >> 1;
            int cnt = 0;

            for(int i=0;i<R;i++){
                cnt+= countSmallerThanOrEqualToMid(matrix[i],mid);
            }

            if(cnt <= (R*C)/2) low = mid+1;
            else high = mid-1;
        }

        return low;
    }

    private int countSmallerThanOrEqualToMid(int[] A, int mid) {
        int lo = 0;
        int hi = A.length-1;

        while(lo <= hi){
            int m = (lo+hi) >> 1;
            if(A[m] <= mid){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }

        return lo;
    }
}
