package Test_415_ValidPalindrome_easy;

/**
 * Created by zmt on 2017/7/26.
 */
public class ValidPalindrome {
    public static void main(String [] args){
        System.out.println(isPalindrome("a."));
    }
    public static boolean isPalindrome(String s) {
        // Write your code here
        if(s == null){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        char low;
        char high;
        while(start <= end){
            low = s.charAt(start);
            high = s.charAt(end);
            if(!letterOrDigital(low)){
                start++;
                continue;
            }
            if(!letterOrDigital(high)){
                end--;
                continue;
            }
            high = Character.toLowerCase(high);
            low = Character.toLowerCase(low);
            if(high == low){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean letterOrDigital(char c) {
        return c >= 48 && c <= 57 || c >= 65 && c <= 92 || c >= 97 && c <= 122;
    }
}
