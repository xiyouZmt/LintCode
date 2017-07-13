## LintCode
### 44. <a href="http://www.lintcode.com/en/problem/minimum-subarray/"> MinimumSubArray (Easy) </a>

```java

package Test_044_MinimumSubArray_easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/6/27.
 */
public class MinimumSubArray {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-5);
        list.add(1);
        list.add(-2);
        list.add(3);
        System.out.println(minSubArray(list));
    }
    public static int minSubArray(ArrayList<Integer> nums){
        if (nums == null){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
            min = Math.min(min, sum);
            sum = Math.min(sum, 0);
        }
        return min;
    }
}

```