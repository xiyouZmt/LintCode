package Test_181_FlipBits_easy;

/**
 * Created by zmt on 2017/7/16.
 */
public class FlipBits {

    public static void main(String [] args){
        System.out.println(bitSwapRequired(12, 10));
    }

    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int xor = a ^ b;
        int count = 0;
        while(xor != 0){
            count++;
            xor = xor & (xor - 1);
        }
        return count;
    }
}
