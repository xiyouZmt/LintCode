## LintCode
### 655. <a href="http://www.lintcode.com/problem/big-integer-addition"> Big Integer Addition (Easy) </a>

```java

package Test_655_BigIntegerAddition_easy;

/**
 * Created by zmt on 2017/7/11.
 */
public class BigIntegerAddition {
    public static void main(String [] args){
        System.out.println(addStrings("634574", "987294"));
    }
    public static String addStrings(String num1, String num2) {
        // Write your code here
        if(num1 != null && num2 != null){
            StringBuilder builder = new StringBuilder();
            if(num1.length() != num2.length()){
                int num1Length = num1.length();
                int num2Length = num2.length();
                for (int i = 0; i < Math.abs(num1Length - num2Length); i++) {
                    builder.append(0);
                }
                if(num1.length() > num2.length()){
                    builder.append(num2);
                    num2 = builder.toString();
                } else {
                    builder.append(num1);
                    num1 = builder.toString();
                }
            }
            int carry = 0;
            int plus;
            int [] result = new int[num1.length()];
            for (int i = num1.length() - 1; i >= 0; i--) {
                plus = num1.charAt(i) + num2.charAt(i) - 96 + carry;
                carry = plus / 10;
                result[i] = plus % 10;
            }
            builder.delete(0, builder.length());
            if(carry != 0){
                builder.append(carry);
            }
            for (int i : result) {
                builder.append(i);
            }
            return builder.toString();
        }
        return null;
    }
}

```