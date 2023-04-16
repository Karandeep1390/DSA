package Stack;

import java.util.*;

public class asteroidCollision {
    public static int[] asteroidCollisio(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int i : asteroids){
            while (!st.isEmpty() && st.peek() > 0 && st.peek() < -i) {
                st.pop();
            }

            if(st.isEmpty() || i > 0 || st.peek() < 0) st.push(i);
            else if (i < 0 && st.peek() == -i) st.pop();


        }

        int [] ans = new int[st.size()];
        int j = 0;
        while(!st.isEmpty()){
            ans[j++] = st.pop();
        }

        return reverse(ans);
    }

    private static int[] reverse(int[] ans) {
        int i = 0;
        int j = ans.length-1;

        while(i<j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }

        return ans;
    }
    public static void main(String[] args) {
        int a[] = {5,10,-5};
        int [] ans = asteroidCollisio(a);
        for(int ab : ans){
            System.out.print(ab + " ");
        }
    }
}
