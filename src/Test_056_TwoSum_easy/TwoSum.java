package Test_056_TwoSum_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmt on 2017/7/26.
 */
public class TwoSum {
    public static void main(String [] args){
        int [] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbers, 10)));
    }

    /**
     * 如果不是有序的,用HashMap
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
        if(numbers == null || numbers.length == 0){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.get(numbers[i]) != null){
                int [] result = new int[2];
                result[0] = map.get(numbers[i]) + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(target - numbers[i], i);
        }
        return null;
    }

    /**
     * 如果是排序的数组，两个下标求和效率最高
     */
//    public static int [] twoSum(int [] numbers, int target){
//        if(numbers == null || numbers.length == 0){
//            return null;
//        }
//        int low = 0, high = numbers.length - 1;
//        while (low < high){
//            if(numbers[low] + numbers[high] > target){
//                high--;
//            } else if(numbers[low] + numbers[high] < target){
//                low++;
//            } else {
//                int [] result = new int[2];
//                result[0] = low;
//                result[1] = high;
//                return result;
//            }
//        }
//        return null;
//    }
}
