## LintCode
### 56. <a href="http://www.lintcode.com/en/problem/two-sum/"> Two Sum (Easy) </a>

```java

package Test_056_TwoSum_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmt on 2017/7/26.
 */
public class TwoSum {
    public static void main(String [] args){
        int [] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
        if(numbers == null || numbers.length == 0){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.get(numbers[i]) != null){
                int [] result = new int[2];
                result[0] = map.get(numbers[i]) + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(target - numbers[i], i);
        }
        return null;
    }
}

```