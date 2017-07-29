## LintCode
### 142. <a href="http://lintcode.com/en/problem/o1-check-power-of-2/"> O(1) Check Power of 2 (Easy) </a>

```java

package Test_142_CheckPowerOf2_easy;

/**
 * Created by zmt on 2017/7/22.
 */
public class CheckPowerOf2 {
    public static void main(String [] args){
        System.out.println(checkPowerOf2(4));
    }
    public static boolean checkPowerOf2(int n) {
        // write your code here
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}

```