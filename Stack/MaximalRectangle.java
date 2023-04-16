package Stack;

public class MaximalRectangle {

    public static int maximalRectangle(char[][] matrix) {
        int area = 0;
        int [] heights = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == '1') heights[j]++;
                else heights[j] = 0;
            }
            area = Math.max(area, LargestRecatngleArea.largestRectangleArea(heights));
        }
        return area;
    }

    public static void main(String[] args) {
        char [][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));

    }
}
