package Test_28_Search2DMatrix_easy;

/**
 * Created by zmt on 2017/6/25.
 */
public class Search2DMatrix {
    public static void main(String [] args){
        int [][] matrix = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        System.out.println(searchMatrix(matrix, 7));
    }

    /**
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int row = 0;
        int column = matrix[row].length - 1;
        while (row < matrix.length && column >= 0){
            if (matrix[row][column] > target){
                column--;
            } else if (matrix[row][column] < target){
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
