## LintCode
### 14. <a href="http://www.lintcode.com/problem/first-position-of-target"> FirstPositionOfTarget (Easy) </a>

```java

package Test_014_FirstPositionOfTarget_easy;

/**
 * Created by zmt on 2017/6/23.
 */
public class FirstPositionOfTarget {
    public static void main(String [] args){
        int [] nums = {4,5,9,9,12,13,14,15,15,18};
        System.out.println(binarySearchFirst(nums, 9));
    }
    public static int binarySearchFirst(int [] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0, end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end){
            if(nums[mid] == target){
                /**
                 * 正向找第一个出现的
                 */
                int i;
                for (i = mid - 1; i >= 0 ; i--) {
                    if(nums[i] != target){
                        break;
                    }
                }
                return i + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
                mid = (start + end) / 2;
            } else if(nums[mid] < target){
                start = mid + 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}

```