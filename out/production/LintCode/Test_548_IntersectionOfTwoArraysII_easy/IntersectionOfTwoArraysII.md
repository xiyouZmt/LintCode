## LintCode
### 548. <a href="http://www.lintcode.com/en/problem/intersection-of-two-arrays-ii/"> Intersection of Two Arrays II (Easy) </a>

```java

package Test_548_IntersectionOfTwoArraysII_easy;

import java.util.*;

/**
 * Created by zmt on 2017/7/17.
 */
public class IntersectionOfTwoArraysII {
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
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums1[i]) - 1);
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

```