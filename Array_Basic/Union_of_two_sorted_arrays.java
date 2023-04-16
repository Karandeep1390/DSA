package Array_Basic;

import java.util.ArrayList;

public class Union_of_two_sorted_arrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i = 0;
        int j = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        if(arr1[i] < arr2[j]){
            list.add(arr1[i]);
            i++;
        }else if(arr1[i] > arr2[j]){
            list.add(arr2[j]);
            j++;
        }else{
            list.add(arr1[i]);
            i++;
            j++;
        }
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(list.get(list.size()-1) != arr1[i])list.add(arr1[i]);
                i++;
            }else if(arr1[i] > arr2[j]){
                if(list.get(list.size()-1) != arr2[j])list.add(arr2[j]);
                j++;
            }else{
                if(list.get(list.size()-1) != arr1[i])list.add(arr1[i]);
                i++;
                j++;
            }
        }

        while(i < arr1.length){
            if(list.get(list.size()-1) != arr1[i])list.add(arr1[i]);
            i++;
        }

        while(j < arr2.length){
            if(list.get(list.size()-1) != arr2[j]) list.add(arr2[j]);
            j++;
        }

        return list;
    }

    public static void main(String[] args) {
        int arr1[] = {13,17,18,19,20,22,22,27,36,39,46,48,50};
        int arr2[] = {4,12,45};
        ArrayList<Integer> ans = findUnion(arr1, arr2, 5, 3);
        for(int a : ans){
            System.out.print(a);
        }
    }
}
