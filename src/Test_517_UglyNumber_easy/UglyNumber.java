package Test_517_UglyNumber_easy;

/**
 * Created by zmt on 2017/7/26.
 */
public class UglyNumber {
    public static void main(String [] args){
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int num) {
        // Write your code here
        if(num < 1){
            return false;
        }
        if(num == 1){
            return true;
        }
        while(num % 2 == 0 || num % 3 == 0 || num % 5 == 0){
            if(num % 2 == 0){
                num /= 2;
            } else if(num % 3 == 0){
                num /= 3;
            } else if(num % 5 == 0){
                num /= 5;
            } else {
                return false;
            }
            if(num == 1){
                return true;
            }
        }
        return false;
    }
}
