## LintCode
### 366. <a href="http://www.lintcode.com/en/problem/fibonacci/"> Fibonacci (Easy) </a>

```java

package Test_366_Fibonacci_easy;

/**
 * Created by zmt on 2017/7/29.
 */
public class Fibonacci {
    public static void main(String [] args){
        System.out.println(fibonacci(6));
    }
    public static int fibonacci(int n) {
        // write your code here
        int first = 0;
        int second = 1;
        if(n < 1){
            return -1;
        } else if(n == 1){
            return first;
        } else if(n == 2){
            return second;
        } else {
            int result = 0;
            for (int i = 3; i <= n; i++){
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}

```