package Test_491_PalindromeNumber_easy;

/**
 * Created by zmt on 2017/7/22.
 */
public class PalindromeNumber {
    public static void main(String [] args){
        System.out.println(palindromeNumber(12345));
    }
    public static boolean palindromeNumber(int num) {
        // Write your code here
        if(num < 0){
            return false;
        }
        if(num == 0){
            return true;
        }
        int temp = num;
        int remainder = 0;
        while(temp != 0){
            remainder = remainder * 10 + temp % 10;
            temp /= 10;
        }
        return remainder == num;
    }
}
