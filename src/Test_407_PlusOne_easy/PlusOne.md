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
//    public static int[] plusOne(int[] digits) {
//        // Write your code here
//        if(digits == null){
//            return null;
//        }
//        long sum = 0;
//        for(int i = 0; i < digits.length; i++){
//            sum += (long) (digits[i] * Math.pow(10, digits.length - 1 - i));
//        }
//        sum++;
//        long temp = sum;
//        int length = 0;
//        while(temp != 0){
//            length++;
//            temp /= 10;
//        }
//        int [] plusOne = new int[length];
//        int pos = length - 1;
//        while(sum != 0){
//            plusOne[pos] = (int)(sum % 10);
//            sum /= 10;
//            pos--;
//        }
//        return plusOne;
//    }

    public static int [] plusOne(int [] nums){
        if(nums == null || nums.length == 0){
            return null;
        }
        int carries = 1;
        int sum;
        for (int i = nums.length - 1; i >= 0 && carries > 0; i--) {
            sum = nums[i] + carries;
            nums[i] = sum % 10;
            carries = sum / 10;
        }
        if(carries == 0){
            return nums;
        }
        int [] digits = new int[nums.length + 1];
        digits[0] = 1;
        for (int i = 1; i < digits.length; i++) {
            digits[i] = nums[i - 1];
        }
        return digits;
    }

}

```