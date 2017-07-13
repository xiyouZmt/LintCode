## LintCode
### 45. <a href="http://www.lintcode.com/en/problem/maximum-subarray-difference/"> Maximum SubArray Diference (Medium) </a>

```java

package Test_045_MaximumSubArrayDifference_medium;

/**
 * Created by zmt on 2017/6/27.
 */
public class MaximumSubArrayDifference {
    public static void main(String [] args){
        int [] num = {-5, -4};
        System.out.println(maxSubArray(num));
    }
    public static int maxSubArray(int [] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int max = 0, temp ;
        for (int i = 1; i < nums.length; i++) {
            int max1 = 0, min1 = 0, sumMax = 0;
            int max2, min2, sumMin = 0;
            int tempMax = Integer.MIN_VALUE;
            int tempMin = Integer.MAX_VALUE;
            for (int n = 0; n < nums.length; n++) {
                /**
                 * max subArray
                 */
                sumMax += nums[n];
                tempMax = Math.max(tempMax, sumMax);
                sumMax = Math.max(sumMax, 0);

                /**
                 * min subArray
                 */
                sumMin += nums[n];
                tempMin = Math.min(tempMin, sumMin);
                sumMin = Math.min(sumMin, 0);

                if(n == i - 1){
                    max1 = tempMax;
                    min1 = tempMin;
                    tempMax = Integer.MIN_VALUE;
                    tempMin = Integer.MAX_VALUE;
                    sumMax = 0;
                    sumMin = 0;
                }
            }
            max2 = tempMax;
            min2 = tempMin;
            int x1 = Math.abs(max1 - min2);
            int x2 = Math.abs(max2 - min1);
            temp = x1 > x2 ? x1 : x2;
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }
}

```