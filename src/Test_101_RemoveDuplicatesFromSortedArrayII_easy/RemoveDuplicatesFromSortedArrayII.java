package Test_101_RemoveDuplicatesFromSortedArrayII_easy;

import java.util.LinkedHashMap;

/**
 * Created by zmt on 2017/7/23.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String [] args){
        int [] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return 0;
        }
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int length = 0;
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                if(val < 2){
                    map.put(nums[i], val + 1);
                    nums[pre] = nums[i];
                    pre++;
                } else {
                    length++;
                }
            } else {
                map.put(nums[i], 1);
                nums[pre] = nums[i];
                pre++;
            }
        }
        return nums.length - length;
    }
}
