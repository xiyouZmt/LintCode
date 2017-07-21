## LintCode
### 64. <a href="http://www.lintcode.com/en/problem/merge-sorted-array/"> Merge Sorted Array (Easy) </a>

```java

package Test_064_MergeSortedArray_easy;

/**
 * Created by zmt on 2017/7/20.
 */
public class MergeSortedArray {
    public static void main(String [] args){
        int [] A = {9,10,11,12,13,0,0,0,0};
        int [] B = {4,5,6,7};
        mergeSortedArray(A, 5, B, 4);
    }
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if(A == null || A.length == 0 || B == null || B.length == 0){
            return;
        }
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0){
            if(A[i] > B[j]){
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }
        while (i >= 0){
            A[index--] = A[i--];
        }
        while (j >= 0){
            A[index--] = B[j--];
        }
    }
}

```