## LintCode
### 413. <a href="http://www.lintcode.com/en/problem/reverse-integer/"> Reverse Integer (Easy) </a>

```java

package Test_413_ReverseInteger_easy;

/**
 * Created by zmt on 2017/7/23.
 */
public class ReverseInteger {
    public static void main(String [] args){
        System.out.println(reverseInteger(-123));
    }
    public static int reverseInteger(int n) {
        // Write your code here
        boolean negative = false;
        if(n < 0){
            n = -n;
            negative = true;
        }
        if(n == 0){
            return n;
        }
        int temp = n;
        int length = 0;
        while(temp > 0){
            length++;
            temp /= 10;
        }
        long sum = 0;
        while(n != 0){
            sum += n % 10 * Math.pow(10, length - 1);
            if(sum > Integer.MAX_VALUE){
                return 0;
            }
            n /= 10;
            length--;
        }
        if(negative){
            sum = -sum;
        }
        return (int) sum;
    }
}

```