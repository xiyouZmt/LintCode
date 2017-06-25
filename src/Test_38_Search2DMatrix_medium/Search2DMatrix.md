## LintCode
### 38. <a href="http://lintcode.com/problem/search-a-2d-matrix-ii"> Search2DMatrix (Medium) </a>

	package Test_38_Search2DMatrix_medium;

	/**
	 * Created by zmt on 2017/6/24.
	 */
	public class Search2DMatrix {
	    public static void main(String [] args){
	        int [][] matrix = {
	                {1, 3, 5, 7},
	                {6, 7, 16, 20},
	                {7, 30, 34, 50}};
	        System.out.println(searchMatrix(matrix, 7));
	    }
	    public static int searchMatrix(int [][] matrix, int target){
	        if(matrix == null || matrix.length == 0){
	            return 0;
	        }
	        int count = 0;
	        int row = 0;
	        int column = matrix[row].length - 1;
	        while (row < matrix.length && column >= 0){
	            if(matrix[row][column] > target){
	                column--;
	            } else if(matrix[row][column] < target){
	                row ++;
	            } else {
	                count++;
	                column--;
	                row++;
	//                return true;
	            }
	        }
	        return count;
	    }
	}
