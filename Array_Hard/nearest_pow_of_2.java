package Array_Hard;

public class nearest_pow_of_2 {
    public static int nearestPowerOfTwo(int n){
        int least_power = leftmost(n);
        int greater_power = leftmost(n)+1;
        
        int least_number = (int) Math.pow(2,least_power);
        int greater_number = (int) Math.pow(2,greater_power);
        
         return (n - least_number <= greater_number-n) ? least_number : greater_number;
    }
    
    public static int leftmost(int n){
        int count = 0;
        while(n > 1){
            n = n / 2;
            count++;
        }
         return count;
    }

    public static void main(String[] args) {
        System.out.println(nearestPowerOfTwo(100));
    }
    
}
