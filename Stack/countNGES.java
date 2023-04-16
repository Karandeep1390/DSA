package Stack;

public class countNGES {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
        int [] ans = new int[queries];
        
        for(int i=0;i<queries;i++){
            int k = indices[i];
            int j = k+1;
            
            int count = 0;
            while(j < arr.length){
                if(arr[j++] > arr[k]){
                    count++;
                }
            }
            
            ans[i] = count;
        }
        
        return ans;
      }
}
