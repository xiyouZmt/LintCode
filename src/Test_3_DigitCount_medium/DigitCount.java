package Test_3_DigitCount_medium;

/**
 * Created by zmt on 2017/6/21.
 */
public class DigitCount {

    public static void main(String [] args){
        System.out.println(digitCount(1, 10));
    }

    private static int digitCount(int k, int n){
        // write your code here
        int length = 0;
        int temp = n;
        if(n == 0){
            length = 1;
        } else {
            while (temp != 0){
                length++;
                temp /= 10;
            }
        }
        if (length == 1){
            if (n < k){
                return 0;
            } else {
                return 1;
            }
        } else {
            int highest = n / (int) Math.pow(10, length - 1);
            int count;
            temp = 0;
            for (int j = 1; j < length; j++){
                temp = (10 - 1) * temp + (int) Math.pow(10, (j - 1)) + (int) Math.pow(10, (j - 2)) * (j - 1);
            }
            int suffix = n % (int) Math.pow(10, (length - 1));
            int suffixCount = digitCount(k, suffix);
            if (highest < k){
                count = temp * highest + suffixCount;
            } else if (highest == k){
                count = temp * highest + suffix + 1 + suffixCount;
            } else {
                int pow;
                if(k == 0){
                    pow = 0;
                } else {
                    pow = (int) Math.pow(10, (length - 1));
                }
                count = temp * highest + suffixCount + pow;
            }
            return count;
        }
    }
}
