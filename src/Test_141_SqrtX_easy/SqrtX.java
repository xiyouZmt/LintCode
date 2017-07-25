package Test_141_SqrtX_easy;

/**
 * Created by zmt on 2017/7/24.
 */
public class SqrtX {
    public static void main(String [] args){
        System.out.println(sqrt(2147483647));
    }
    public static int sqrt(int x) {
        // write your code here
        if(x < 0){
            return -1;
        }
        for(int i = 0; i <= x / 2; i++){
            int multiply = i * i;
            System.out.println(multiply);
            if(multiply == x){
                return i;
            } else if(multiply > (long)x || multiply < 0){
                return i - 1;
            }
        }
        return 1;
        // return (int) Math.floor( Math.pow((double)x, 0.5) );
    }
}
