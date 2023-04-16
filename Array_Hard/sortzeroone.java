package Array_Hard;

public class sortzeroone {
    public static void sort_O1(int [] arr){
        int i = 0;
        int j = 0;
        
        while( j < arr.length){
            if( arr[j] == 0){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                j++;
            }
        }
    }
    
    public static void swap(int [] arr,int i, int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,1,1,0,1,0,0,1,0,0,1};
        sort_O1(arr);
       for(int a: arr){
        System.out.print(a+" "); 
       }
    }
}
