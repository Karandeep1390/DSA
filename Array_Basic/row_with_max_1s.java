package Array_Basic;

public class row_with_max_1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i = 0;
        int j = m-1;
        int row = -1;
        while(j >= 0 && i < n){
            if(arr[i][j] == 1){
                j--;
                row = i;
            }else{
                i++;
            }
        }
        
        return row;
    }
}
