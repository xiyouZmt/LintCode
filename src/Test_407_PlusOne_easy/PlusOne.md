## LintCode
### 407. <a href="http://www.lintcode.com/en/problem/plus-one/"> Plus One (Easy) </a>

```java

package Test_407_PlusOne_easy;

import java.util.Arrays;

/**
 * Created by zmt on 2017/7/23.
 */
public class PlusOne {
    public static void main(String [] args){
        int [] plusOne = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(plusOne)));
    }
    public static int[] plusOne(int[] digits) {
        // Write your code here
        if(digits == null){
            return null;
        }
        long sum = 0;
        for(int i = 0; i < digits.length; i++){
            sum += (long) (digits[i] * Math.pow(10, digits.length - 1 - i));
        }
        sum++;
        long temp = sum;
        int length = 0;
        while(temp != 0){
            length++;
            temp /= 10;
        }
        int [] plusOne = new int[length];
        int pos = length - 1;
        while(sum != 0){
            plusOne[pos] = (int)(sum % 10);
            sum /= 10;
            pos--;
        }
        return plusOne;
    }
}

```