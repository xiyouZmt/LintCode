## LintCode
### 172. <a href="http://www.lintcode.com/en/problem/remove-element/"> Remove Element (Easy) </a>

```java

package Test_172_RemoveElement_easy;

/**
 * Created by zmt on 2017/7/23.
 */
public class RemoveElement {
    public static void main(String [] args){
        int [] nums = {0,4,4,0,0,2,4,4};
        System.out.println(removeElement(nums, 4));
        for (int a : nums) {
            System.out.println(a);
        }
    }
    public static int removeElement(int[] A, int elem) {
        // write your code here
        if(A == null){
            return 0;
        }
        int length = 0;
        int pos = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                A[pos] = A[i];
                pos++;
            } else {
                length++;
            }
        }
        return A.length - length;
    }
}

```