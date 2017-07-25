package Test_138_SubarraySum_easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zmt on 2017/7/25.
 */
public class SubArraySum {
    public static void main(String [] args){
        int [] nums = {-3, 1, 2, -3, 4};
        System.out.println(subarraySum(nums));
    }
    public static ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int len = nums.length;
//        ArrayList<int []> ans = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
//                int [] interval = new int[2];
//                interval[0] = map.get(sum) + 1;
//                interval[1] = i;
//                ans.add(interval);
                ans.add(map.get(sum) + 1);
                ans.add(i);
                return ans;
            }
            map.put(sum, i);
        }
        return ans;
    }
}
