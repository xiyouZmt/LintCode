package Test_488_HappyNumber_easy;

import java.util.HashSet;

/**
 * Created by zmt on 2017/7/16.
 */
public class HappyNumber {
    public static void main(String [] args){
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        // Write your code here
        if(n == 0){
            return false;
        }
        int temp = n;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(temp != 1){
            while(temp != 0){
                sum += Math.pow(temp % 10, 2.0);
                temp /= 10;
            }
            if(set.contains(sum)){
                return false;
            } else {
                set.add(sum);
                temp = sum;
                sum = 0;
            }
        }
        return true;
    }
}
