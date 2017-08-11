package Test_539_MoveZeroes_easy;

/**
 * Created by zmt on 2017/7/21.
 */
public class MoveZeroes {
    public static void main(String [] args){
        int [] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }

//    public static void moveZeroes(int[] nums) {
//        // Write your code here
//        if(nums == null || nums.length == 0){
//            return;
//        }
//        int noZeroPos = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] != 0){
//                nums[noZeroPos] = nums[i];
//                noZeroPos++;
//            }
//        }
//        for(int i = noZeroPos; i < nums.length; i++){
//            nums[i] = 0;
//        }
//    }

    public static void moveZeroes(int [] nums){
        if(nums == null || nums.length == 0){
            return;
        }
        int left = 0, right = 0;
        int temp;
        while (right < nums.length){
            if(nums[right] != 0){
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
}
