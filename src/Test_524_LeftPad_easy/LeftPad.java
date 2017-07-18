package Test_524_LeftPad_easy;

/**
 * Created by zmt on 2017/7/18.
 */
public class LeftPad {
    public static void main(String [] args){
        System.out.println(leftPad("foo", 5));
        System.out.println(leftPad("1", 2, '0'));
    }

    /**
     * @param originalStr the string we want to append to with spaces
     * @param size the target length of the string
     * @return a string
     */
    public static String leftPad(String originalStr, int size) {
        // Write your code here
        return leftPad(originalStr, size, ' ');
    }

    /**
     * @param originalStr the string we want to append to
     * @param size the target length of the string
     * @param padChar the character to pad to the left side of the string
     * @return a string
     */
    public static String leftPad(String originalStr, int size, char padChar) {
        // Write your code here
        int length = originalStr.length();
        if(length >= size){
            return originalStr;
        } else {
            int distance = size - length;
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < distance; i++){
                builder.append(padChar);
            }
            builder.append(originalStr);
            return builder.toString();
        }
    }
}
