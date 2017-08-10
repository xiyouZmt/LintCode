package Test_046_MajorityNumber_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmt on 2017/7/19.
 */
public class MajorityNumber {
    public static void main(String [] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(majorityNumber(nums));
    }

    /**
     * 如果数组中不存在主元素，返回-1
     * @param nums
     * @return
     */
    public static int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() == 0){
            return -1;
        }
        if(nums.size() == 1){
            return nums.get(0);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if(map.containsKey(i)){
                int newVal = map.get(i) + 1;
                map.put(i, newVal);
                if(newVal > nums.size() / 2){
                    return i;
                }
            } else {
                map.put(i, 1);
            }
        }
        return -1;
    }

    /**
     * 如果数组中一定存在主元素，该方法极为高效
     */
//    public static int majorityNumber(ArrayList<Integer>  nums){
//        if(nums == null || nums.size() == 0){
//            return -1;
//        }
//        if(nums.size() == 1){
//            return nums.get(0);
//        }
//        int count = 0;
//        int candidate = -1;
//        for (Integer num : nums) {
//            if (count == 0) {
//                candidate = num;
//                count = 1;
//            } else if (candidate == num) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        return candidate;
//    }

}
