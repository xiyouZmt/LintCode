package Test_547_IntersectionOfTwoArrays_easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by zmt on 2017/7/17.
 */
public class IntersectionOfTwoArrays {
    public static void main(String [] args){
        int [] nums1 = {1,2,3,4};
        int [] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        if(nums1 == null || nums2 == null){
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int aNubs1 : nums1) {
            set.add(aNubs1);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int aNubs2 : nums2) {
            if (set.contains(aNubs2) && !result.contains(aNubs2)) {
                result.add(aNubs2);
            }
        }
        int [] intersection = new int[result.size()];
        int index = 0;
        for(int temp : result){
            intersection[index++] = temp;
        }
        return intersection;
    }
}