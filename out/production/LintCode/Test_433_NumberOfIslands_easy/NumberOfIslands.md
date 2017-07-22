## LintCode
### 433. <a href="http://lintcode.com/en/problem/number-of-islands/"> Number of Islands (Easy) </a>

```java

package Test_110_MinimumPathSum_easy;

package Test_433_NumberOfIslands_easy;

/**
 * Created by zmt on 2017/7/21.
 */
public class NumberOfIslands {
    public static void main(String [] args){
        boolean [][] grid = {
                {true, true, false, false, false},
                {false, true, false, false, true},
                {false, false, false, true, true},
                {false, false, false, false, false},
                {false, false, false, false, true}
        };
        System.out.println(numIslands(grid));
    }
    public static int numIslands(boolean[][] grid) {
        // Write your code here
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j]){
                    count++;
                    DFS(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void DFS(boolean [][] grid, int i, int j){
        if(i < 0 || j < 0 || i > grid.length - 1 || j > grid[i].length - 1){
            return;
        }
        if(grid[i][j]){
            grid[i][j] = false;
            DFS(grid, i - 1, j);
            DFS(grid, i + 1, j);
            DFS(grid, i, j - 1);
            DFS(grid, i, j + 1);
        }
    }
}

```