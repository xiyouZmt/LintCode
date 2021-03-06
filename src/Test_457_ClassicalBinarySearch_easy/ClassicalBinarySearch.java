package Test_457_ClassicalBinarySearch_easy;

import java.util.*;

/**
 * Created by zmt on 2017/7/24.
 */
public class ClassicalBinarySearch {
    public static void main(String [] args){
        int [] nums = {1, 2, 2, 4, 5, 5};
        System.out.println(findPosition(nums, 5));
    }

    public static int findPosition(int[] nums, int target) {
        // Write your code here
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        Map<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> iterator =  map.keySet().iterator();

        while (start <= end){
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                end = mid - 1;
                mid = (start + end) / 2;
            } else {
                start = mid + 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}
