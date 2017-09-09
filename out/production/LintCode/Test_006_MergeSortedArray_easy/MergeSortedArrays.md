## LintCode
### 6. <a href="http://www.lintcode.com/problem/merge-two-sorted-arrays"> Merge Two Sorted Arrays (Easy) </a>

```java

package Test_006_MergeSortedArray_easy;

import java.util.Arrays;

/**
 * Created by zmt on 2017/6/22.
 */
public class MergeSortedArray {
    public static void main(String [] args){
        int [] A = {1,2,3,4,5,6};
        int [] B = {4,5,6,7,8,9};
        System.out.println(Arrays.toString(mergeSortedArray(A, B)));
    }

    public static int [] mergeSortedArray(int [] A, int [] B){
        if (A != null && B != null && A.length != 0 && B.length != 0) {
            int length = A.length + B.length;
            int i = 0, n = 0, pos = 0;
            int [] newArray = new int[length];
            for (; i < A.length && n < B.length;) {
                if (A[i] < B[n]) {
                    newArray[pos] = A[i];
                    i++;
                } else {
                    newArray[pos] = B[n];
                    n++;
                }
                pos ++;
            }
            if (i == A.length) {
                for (int j = n; j < B.length; j++) {
                    newArray[pos] = B[j];
                    pos ++;
                }
            } else if(n == B.length) {
                for (int j = i; j < A.length; j++) {
                    newArray[pos] = A[j];
                    pos ++;
                }
            }
            return newArray;
        }
        return null;
    }
}

```