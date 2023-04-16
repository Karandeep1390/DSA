package BS_Answer_InSearchSpace;

public class book_allocation {
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int min = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int a : A){
            min = Math.max(a,min);
            sum += a;
        }
        
        int left = min;
        int right = sum;
        int ans = -1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(canAllocate(A,M,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        
        return ans;
    }
    
    private static boolean canAllocate(int [] A, int students,int mid){
        int count = 1;
        int sum = 0;
        
        for(int a : A){
            if(sum + a > mid){
                count++;
                sum = a;
            }else{
                sum += a;
            }
        }
        
        return count <= students;
    }
}
