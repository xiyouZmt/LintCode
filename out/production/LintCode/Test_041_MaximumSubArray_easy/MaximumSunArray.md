## LintCode
### 41. <a href="http://lintcode.com/en/problem/maximum-subarray/"> MaximumSubArray </a>

	package Test_041_MaximumSubArray_easy;

	/**
	 * Created by zmt on 2017/6/25.
	 */
	public class MaximumSubArray {
	    public static void main(String [] args){
	        int [] array = {-2, 2,-3,4,-1,2,1,-15,100};
	        System.out.println(maxSubArray(array));
	    }
	    public static int maxSubArray(int[] A) {
	        // write your code
	        if (A == null || A.length == 0){
	            return 0;
	        }
	        int max = Integer.MIN_VALUE, sum = 0;
	        for (int i = 0; i < A.length; i++) {
	            sum += A[i];
	            max = Math.max(max, sum);
	            sum = Math.max(sum, 0);
	        }
	        return max;
	    }
	}
