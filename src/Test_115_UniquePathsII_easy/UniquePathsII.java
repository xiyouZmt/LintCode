package Test_115_UniquePathsII_easy;

/**
 * Created by zmt on 2017/7/26.
 */
public class UniquePathsII {
    public static void main(String [] args){
        int [][] obstacleGrid = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] matrix = new int[m][n];
        if(obstacleGrid[0][0] == 1){
            return 0;
        } else {
            matrix[0][0] = 1;
        }
        for(int i = 1; i < m; i++){
            if(obstacleGrid[i][0] == 0){
                matrix[i][0] = 1;
            } else {
                break;
            }
        }
        for(int j = 1; j < n; j++){
            if(obstacleGrid[0][j] == 0){
                matrix[0][j] = 1;
            } else {
                break;
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
                }
            }
        }
        return matrix[m - 1][n - 1];
    }
}
