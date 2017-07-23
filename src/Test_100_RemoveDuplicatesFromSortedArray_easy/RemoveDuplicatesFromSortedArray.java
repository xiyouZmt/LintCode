package Test_100_RemoveDuplicatesFromSortedArray_easy;

/**
 * Created by zmt on 2017/6/11.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String [] args){
        int nums [] = {0,1,2,3,3,3,4,5,5,6};
        System.out.println("length:" + removeDuplicates(nums));
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int removeDuplicates(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int length = 0;
        int pre = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[pre]){
                length ++;
            } else {
                if(pre + 1 != i){
                    nums[pre + 1] = nums[i];
                }
                pre++;
            }
        }
//        for (int i = pre + 1; i < nums.length; i++) {
//            nums[i] = 0;
//        }
        return nums.length - length;
    }
}
