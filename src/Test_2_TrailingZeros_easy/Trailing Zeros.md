## LintCode
### 2.  <a href="http://lintcode.com/problem/trailing-zeros"> Trailing Zeros (Easy) </a>

    package Test_2_TrailingZeros_easy;

	/**
	 * Created by zmt on 2017/6/25.
	 */
	public class TrailingZeros {
	    public static void main(String [] args){
	        System.out.println(trailingZeros(5));
	    }
	    /*
	     * param n: An desciption
	     * return: An integer, denote the number of trailing zeros in n!
	     */
	    public static long trailingZeros(long n) {
	        // write your code here
	        long sum = 0;
	        while(n != 0){
	            sum += n / 5;
	            n /= 5;
	        }
	        return sum;
	    }
	}
