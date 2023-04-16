package Array_Basic;

public class largest_elememt {
    public int largest(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int a : arr){
            max = Math.max(a,max);
        }
        return max;
    }
}
