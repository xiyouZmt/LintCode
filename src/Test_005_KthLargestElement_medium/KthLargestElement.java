package Test_005_KthLargestElement_medium;

/**
 * Created by zmt on 2017/6/21.
 */
public class KthLargestElement {
    public static void main(String [] args){
        int [] nums = {9, 3, 4, 2, 8};
        System.out.println(kthLargestElement(3, nums));
    }

    public static int kthLargestElement(int k, int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(k <= 0 || k > nums.length){
            return -1;
        }
        int median = nums.length - k;
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
