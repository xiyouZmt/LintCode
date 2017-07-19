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
        nums.add(2);
        System.out.println(majorityNumber(nums));
    }
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
}
