## LintCode
### 60. <a href="http://www.lintcode.com/en/problem/search-insert-position/"> Search Insert Position (Easy) </a>

```java

package Test_060_SearchInsertPosition_easy;

/**
 * Created by zmt on 2017/7/24.
 */
public class SearchInsertPosition {
    public static void main(String [] args){
        int [] A = {1,3,5,6};
        System.out.println(searchInsert(A, 7));
    }
    public static int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null){
            return -1;
        }
        if(A.length == 0){
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        int middle = (start + end) / 2;
        while(start <= end){
            if(A[middle] == target){
                return middle;
            } else if(A[middle] > target){
                end = middle - 1;
                middle = (start + end) / 2;
            } else {
                start = middle + 1;
                middle = (start + end) / 2;
            }
        }
        return start;
    }
}

```