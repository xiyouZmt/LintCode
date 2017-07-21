## LintCode
### 110. <a href="http://www.lintcode.com/en/problem/minimum-path-sum/"> Minimum Path Sum (Easy) </a>

```java

package Test_110_MinimumPathSum_easy;

/**
 * Created by zmt on 2017/7/20.
 */
public class MinimumPathSum {
    public static void main(String [] args){
        int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        // write your code here
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return -1;
        }
        int row = grid.length;
        int col = grid[0].length;
        int [][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        for(int j = 1; j < col; j++){
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for(int i = 1; i < row; i++){
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        int i = 1, j = 1;
        for(; i < row; i++){
            j = 1;
            for(; j < col; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }
}

```