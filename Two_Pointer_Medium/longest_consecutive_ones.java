package Two_Pointer_Medium;

public class longest_consecutive_ones {
    public int longestOnes(int [] A,int k){
        int zeroCount = 0;
        int start = 0;
        int res = 0;

        for(int end = 0;end<A.length;end++){
            if(A[end] == 0) zeroCount++;

            while(zeroCount > k){
                if(A[start] == 0) zeroCount--;
                start++;
            }

            res = Math.max(res, end - start + 1);
        }

        return res;

    }
}
