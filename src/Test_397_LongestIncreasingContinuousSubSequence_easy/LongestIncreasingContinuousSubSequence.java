package Test_397_LongestIncreasingContinuousSubSequence_easy;

/**
 * Created by zmt on 2017/7/19.
 */
public class LongestIncreasingContinuousSubSequence {
    public static void main(String [] args){
        int [] A = {5,1,2,3,4,3,2};
        System.out.println(longestIncreasingContinuousSubSequence(A));
    }
    public static int longestIncreasingContinuousSubSequence(int[] A) {
        // Write your code here
        if(A == null || A.length == 0){
            return 0;
        }
        int length = 1;
        int result = 1;
        for (int i = 1; i < A.length; i++) {
            if(A[i] > A[i - 1]){
                length++;
            } else {
                length = 1;
            }
            result = Math.max(length, result);
        }
        length = 1;
        for (int i = A.length - 2; i >= 0 ; i--) {
            if(A[i] > A[i + 1]){
                length++;
            } else {
                length = 1;
            }
            result = Math.max(result, length);
        }
        return result;
    }
}
