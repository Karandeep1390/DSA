package Array_Hard;

public class one_missing_and_one_repeating {
    int[] findTwoElement(int arr[], int n) {
        int [] ans = new int[2];
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= arr[i];
        }

        for(int i=1;i<=n;i++){
            xor ^= i;
        }

        int rsb = xor & -xor;

        int x = 0;
        int y = 0;

        for(int val : arr){
            if((val & rsb) == 0){
                x = x ^ val;
            }else{
                y = y ^ val;
            }
        }

        for(int i=1;i<=arr.length;i++){
            if((i & rsb) == 0){
                x = x ^ i;
            }else{
                y = y ^ i;
            }
        }

        for(int val : arr){
            if(val == x){
                ans[0] = x;
                ans[1] = y;
            }else if(val == y){
                ans[0] = y;
                ans[1] = x;
            }
        }

        return ans;
     }
}
