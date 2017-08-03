## LintCode
### 82. <a href="http://www.lintcode.com/en/problem/single-number/"> Single Number (Easy) </a>

```java

package Test_082_SingleNumber_easy;

/**
 * Created by zmt on 2017/7/24.
 */
public class SingleNumber {
    public static void main(String [] args){
        int [] A = {1,2,2,1,3,4,3};
        System.out.println(singleNumber(A));
    }
    public static int singleNumber(int[] A) {
        // Write your code here
        if(A == null || A.length == 0){
            return 0;
        }
        int xor = 0;
        for (int a : A) {
            xor ^= a;
        }
        return xor;
    }
}

```