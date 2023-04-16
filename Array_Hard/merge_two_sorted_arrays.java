package Array_Hard;

public class merge_two_sorted_arrays {
    public static void merge(int[] ar1, int n, int[] ar2, int m) {
        int i = n-1;
        int j = m-1;
        int index = ar1.length-1;

        while(j >= 0){
            if(i >= 0 && ar1[i] > ar2[j]){
                ar1[index] = ar1[i];
                index--;
                i--;
            }else{
                ar1[index] = ar2[j];
                index--;
                j--;
            }
        }
    }
}
