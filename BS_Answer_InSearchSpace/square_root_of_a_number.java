package BS_Answer_InSearchSpace;

public class square_root_of_a_number {
    double getNthRoot(int n,int m){
        double low = 1;
        double high = m;

        double diff = 1e-6;

        while((high - low) >= diff){
            double mid = (high + low)/2;

            if(multiply(mid,n) < m){
                low = mid;
            }else{
                high = mid;
            }
        }

        return low;


    }

    private double multiply(double number, int n) {
        double ans = 1.0;
        for(int i=1;i<=n;i++){
            ans = ans * number;
        }
        return ans;
    }
}
