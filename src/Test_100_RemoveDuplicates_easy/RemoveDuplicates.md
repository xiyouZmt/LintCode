## LintCode
### 100. <a href="http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array/"> Remeve Duplicates from Sorted Arrays (Easy) </a>

```java

package Test_100_RemoveDuplicates_easy;

/**
 * Created by zmt on 2017/6/11.
 */
public class RemoveDuplicates {
    public static void main(String [] args){
        int nums [] = {0,1,2,3,3,3,4,5,5,6};
        System.out.println("length:" + removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int length = 0;
        int pre = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[pre]){
                length ++;
            } else {
                if(pre + 1 != i){
                    nums[pre + 1] = nums[i];
                }
                pre++;
            }
        }
        for (int i = pre + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums.length - length;
    }
}

```