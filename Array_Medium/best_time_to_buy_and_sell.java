package Array_Medium;

public class best_time_to_buy_and_sell {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int p : prices){
            if(p < lsf){
                lsf = p;
            }
            pist = p - lsf;

            op = Math.max(op,pist);
        }

        return op;
    }
}
