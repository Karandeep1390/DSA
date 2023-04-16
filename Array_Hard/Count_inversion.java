package Array_Hard;

public class Count_inversion {
    static long inversionCount(long arr[], long N)
    {   
        long [] temp = new long[arr.length];
        return merge_sort(arr,temp,0,arr.length-1);
    }

    private static long merge_sort(long[] arr, long[] temp, int left,int right) {
        int mid = 0;
        long inv_count = 0;

        if(right > left){
            mid = (left + right)/2;
            inv_count += merge_sort(arr, temp, left, mid);
            inv_count += merge_sort(arr, temp, mid+1, right);

            inv_count += merge(arr,temp,left,mid+1,right);
        }

        return inv_count;
    }

    private static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        long inv_count = 0;
        int i = left;
        int j = mid;
        int k = left;

        while((i<=mid-1) && (j<=right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                inv_count += (mid - i);
            }
        }

        while(i <= mid-1){
            temp[k++] = arr[i++];
        }

        while(j <= right){
            temp[k++] = arr[j++];
        }

        for(i=left;i<=right;i++){
            arr[i] = temp[i];
        }

        return inv_count;
    }
}
