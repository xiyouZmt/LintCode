## LintCode
### 539. <a href="http://lintcode.com/en/problem/move-zeroes/"> Move Zeroes (Easy) </a>

```java

package Test_539_MoveZeroes_easy;

/**
 * Created by zmt on 2017/7/21.
 */
public class MoveZeroes {
    public static void main(String [] args){
        int [] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        // Write your code here
        if(nums == null || nums.length == 0){
            return;
        }
        int noZeroPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[noZeroPos] = nums[i];
                noZeroPos++;
            }
        }
        for(int i = noZeroPos; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

```