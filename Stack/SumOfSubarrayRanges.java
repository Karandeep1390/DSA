package Stack;

import java.util.Stack;

public class SumOfSubarrayRanges {
    
    public long Subarray(int [] A){
        int n = A.length;
        long res = 0;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<=n;i++){
            while (!st.isEmpty() && A[st.peek()] > (i == n ? Integer.MIN_VALUE : A[i])) {
                int j = st.pop();
                int k = st.isEmpty() ? -1 : st.peek();

                res -= (long)A[j] * (i-j)*(j-k);
            }
            st.push(i);
        }
        st.clear();

        for(int i=0;i<=n;i++){
            while (!st.isEmpty() && A[st.peek()] < (i == n ? Integer.MAX_VALUE : A[i])) {
                int j = st.pop();
                int k = st.isEmpty() ? -1 : st.peek();

                res += (long)A[j] * (i-j)*(j-k);
            }
            st.push(i);
        }

        return res;

    }
}
