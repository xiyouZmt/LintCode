## LintCode
### 5. <a href="http://www.lintcode.com/problem/kth-largest-element"> Kth Largest Element (Medium) </a>
	
```java

package Test_005_KthLargestElement_medium;

/**
 * Created by zmt on 2017/6/21.
 */
public class KthLargestElement {
    public static void main(String [] args){
        int [] nums = {9, 3, 4, 2, 8};
        System.out.println(kthLargestElement(3, nums));
    }

    private static int kthLargestElement(int k, int [] nums){
        if(nums == null || nums.length == 0 || k > nums.length || k <= 0){
            return 0;
        }
        if(nums.length == 1){
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            int temp;
            if(nums[i] < nums[i - 1]){
                temp = nums[i];
                int j;
                for (j = i - 1; j >= 0; j--) {
                    if(nums[j] > temp){
                        nums[j + 1] = nums[j];
                    } else {
                        break;
                    }
                }
                nums[j + 1] = temp;
            }
        }
        return nums[nums.length - k];
    }
}

```