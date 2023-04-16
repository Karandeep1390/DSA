package Stack;

import java.util.Stack;

public class LargestRecatngleArea {

    public static int largestRectangleArea(int[] h) {
        int n = h.length, i = 0, max = 0;
            
        Stack<Integer> s = new Stack<>();
            
        while (i < n) {
            
            while (!s.isEmpty() && h[i] < h[s.peek()]) {
                max = Math.max(max, h[s.pop()] * (i - (s.isEmpty() ? 0 : s.peek() + 1)));
            }
            s.push(i++);
        }
            
        while (!s.isEmpty()) {
            max = Math.max(max, h[s.pop()] * (n - (s.isEmpty() ? 0 : s.peek() + 1)));
        }
            
        return max;
    }

    public static void main(String[] args) {
        int [] h = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(h));
    }
}

