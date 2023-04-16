package Stack;

//import java.util.*;

public class getMAXXOR {
    public static void main(String[] args) {
        int n = 4;

        int numBits = (int)(Math.log(n)/Math.log(2))+1;
        int x = n;

        while(true){
            int numXbits = (int)(Math.log(x)/Math.log(2))+1;
            if(numBits == numXbits)
                break;
            x++;
        }

        // int maxV = 0;
        // int minV = x;

        // for(int i=x;i>=n;i--){
        //     int v = n;
        //     for(int j=n+1;j<=i;j++){
        //         v^=j;
        //     }

        // }
    }
}
