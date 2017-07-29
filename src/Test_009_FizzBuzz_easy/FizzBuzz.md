## LintCode
### 9. <a href="http://www.lintcode.com/en/problem/fizz-buzz/"> Fizz Buzz (Easy) </a>

```java

package Test_009_FizzBuzz_easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/7/29.
 */
public class FizzBuzz {
    public static void main(String [] args){
        System.out.println(fizzBuzz(6));
    }
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            } else if (i % 5 == 0) {
                results.add("buzz");
            } else if (i % 3 == 0) {
                results.add("fizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}

```