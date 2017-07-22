package Test_373_PartitionArrayByOddAndEven_easy;

import java.util.Arrays;

/**
 * Created by zmt on 2017/7/22.
 */
public class PartitionArrayByOddAndEven {
    public static void main(String [] args){
        int [] nums = {1, 2, 3, 4};
        partitionArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void partitionArray(int[] nums) {
        // write your code here;
        if(nums != null){
            int start = 0;
            int end = nums.length - 1;
            int temp = 0;
            while(start < end){
                if (nums[start] % 2 == 0 && nums[end] % 2 == 1){
                    temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                } else if (nums[start] % 2 == 1 && nums[end] % 2 == 1){
                    start++;
                } else if(nums[start] % 2 == 0 && nums[end] % 2 == 0) {
                    end--;
                } else {
                    start++;
                    end--;
                }
            }
        }
    }
}
