## LintCode
### 365. <a href="http://www.lintcode.com/en/problem/count-1-in-binary/"> Count 1 in Binary (Easy) </a>

```java

package Test_365_Count1InBinary_easy;

/**
 * Created by zmt on 2017/7/14.
 */
public class Count1InBinary {
    public static void main(String [] args){
        System.out.println(countOnes(100));
    }
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public static int countOnes(int num) {
        // write your code here
        int count = 0;
        while (num != 0){
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}

```