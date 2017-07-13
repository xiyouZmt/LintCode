package Test_111_ClimbingStairs_easy;

import java.util.Scanner;

/**
 * Created by zmt on 2017/7/13.
 */
public class ClimbingStairs {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(climbStairs(sc.nextInt()));
    }
    public static int climbStairs(int n){
        // write your code here
        int first = 1;
        int second = 2;
        if(n < 1){
            return 1;
        } else if(n == 1){
            return first;
        } else if(n == 2){
            return second;
        } else {
            int result = 0;
            for(int i = 3; i <= n; i++){
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}
