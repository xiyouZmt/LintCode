package Test_142_CheckPowerOf2_easy;

/**
 * Created by zmt on 2017/7/22.
 */
public class CheckPowerOf2 {
    public static void main(String [] args){
//        String str = "hello";
//        String str1 = "hello world";
//        System.out.println(str1.equals(str + "world"));
        System.out.println(checkPowerOf2(4));
    }
    public static boolean checkPowerOf2(int n) {
        // write your code here
        return n > 0 && (n & (n - 1)) == 0;
    }
}
