## LintCode
### 1. <a href="http://lintcode.com/problem/a-b-problem" target="_blank"> A Plus B (Easy) <a/>
    
	package Test_001_APlusB_easy;

	/**
	 * Created by zmt on 2017/6/25.
	 */
	public class APlusB {

	    public static void main(String [] args){
	        System.out.println(aplusb(2, 4));
	    }
	
	    /**
	     * param a: The first integer
	     * param b: The second integer
	     * return: The sum of a and b
	     */
	    public static int aplusb(int a, int b) {
	        // write your code here, try to do it without arithmetic operators.
	        int temp;
	        do {
	            temp = a & b;   //进位
	            a = a ^ b;      //结果
	            b = temp << 1;   //进位乘2
	        } while(b != 0);
	        return a;
	    }
	}

<<<<<<< HEAD
### <a href="http://blog.csdn.net/zhumintao/article/details/53873025" target="_blank"> 参考博客 另类加法 </a>
=======
### <a href="http://blog.csdn.net/zhumintao/article/details/53873025" target="_blank"> 参考博客 另类加法 </a>
>>>>>>> 279d46d8b2da9eb0b560da3e60f5987e39cc908d
