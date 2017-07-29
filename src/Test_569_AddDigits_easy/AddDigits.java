package Test_569_AddDigits_easy;

/**
 * Created by zmt on 2017/7/29.
 */
public class AddDigits {
    public static void main(String [] args){
        System.out.println(addDigits(234));
    }
    public static int addDigits(int num) {
        // Write your code here
        if(num < 0){
            return -1;
        } else if(num <10){
            return num;
        } else {
            int sum = 0;
            do{
                while (num != 0){
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
                sum = 0;
            } while(num >= 10);
            return num;
        }
    }
}
