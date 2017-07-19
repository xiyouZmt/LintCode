package Test_80_Median_easy;

/**
 * Created by zmt on 2017/7/19.
 */
public class Median {
    public static void main(String [] args){
        int [] nums = {4, 5, 1, 2, 3};
        System.out.println(median(nums));
    }
    public static int median(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int median = nums.length % 2 == 0 ? nums.length / 2 - 1 : nums.length / 2;
        return helper(nums, 0, nums.length - 1, median);
    }

    public static int helper(int [] nums, int left, int right, int median){
        int pos = quickSort(nums, left, right);
        if(pos == median){
            return nums[pos];
        } else if(pos > median){
            return helper(nums, left, pos - 1, median);
        } else {
            return helper(nums, pos + 1, right, median);
        }
    }

    public static int quickSort(int [] nums, int left, int right){
        int pivot = nums[left];
        while (left < right){
            while (left < right && nums[right] >= pivot){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] < pivot){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }

}
