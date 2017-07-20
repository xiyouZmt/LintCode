## LintCode
### 185. <a href="http://www.lintcode.com/en/problem/matrix-zigzag-traversal/"> Matrix Zigzag Traversal (Easy) </a>

```java

package Test_185_MatrixZigzagTraversal_easy;

import java.util.Arrays;

/**
 * Created by zmt on 2017/7/19.
 */
public class MatrixZigzagTraversal {
    public static void main(String [] args){
        int [][] zMatrix = {
                {1, 2,  3,  4},
                {5, 6,  7,  8},
                {9,10, 11, 12}
        };
        System.out.println(Arrays.toString(printZMatrix(zMatrix)));
    }
    public static int[] printZMatrix(int[][] matrix) {
        // write your code here
        if(matrix == null || matrix.length == 0){
            return null;
        }
        int [] zMatrix = new int[matrix.length * matrix[0].length];
        boolean up = true;
        int i = 0, j = 0;
        int count = 0;
        while (true){
            zMatrix[count] = matrix[i][j];
            if(i == matrix.length -1 && j == matrix[i].length - 1){
                break;
            }
            if(up){
                i--;
                j++;
                if(j >= matrix[i + 1].length){
                    i += 2;
                    j -= 1;
                    up = false;
                } else if(i < 0) {
                    i++;
                    up = false;
                }
            } else {
                j--;
                i++;
                if(i >= matrix.length){
                    j += 2;
                    i -= 1;
                    up = true;
                } else if(j < 0){
                    j++;
                    up = true;
                }
            }
            count ++;
        }
        return zMatrix;
    }
}

```