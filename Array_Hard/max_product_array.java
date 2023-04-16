package Array_Hard;

public class max_product_array {
    public int maxProduct(int[] arr){
        int ans = Integer.MIN_VALUE;
        int cp = 1;
        for(int val : arr){
            cp *= val;
            ans = Math.max(ans, cp);
            if(cp == 0) cp = 1;
        }

        cp = 1;

        for(int i = arr.length-1;i>=0;i--){
            cp *= arr[i];
            ans = Math.max(ans, cp);
            if(cp == 0) cp = 1;
        }

        return ans;
    }
}
