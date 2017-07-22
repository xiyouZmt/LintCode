package Test_142_CheckPowerOf2_easy;

/**
 * Created by zmt on 2017/7/22.
 */
public class CheckPowerOf2 {
    public static void main(String [] args){
        System.out.println(checkPowerOf2(4));
    }
    public static boolean checkPowerOf2(int n) {
        // write your code here
        if(n <= 0){
            return false;
        }
        int zero = (int) Math.floor(Math.log((double)n) / Math.log(2.0));
        int temp = 1 << zero;
        int result = temp | n;
        return result == temp;
    }
}
