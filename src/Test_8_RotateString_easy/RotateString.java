package Test_8_RotateString_easy;

/**
 * Created by zmt on 2017/6/22.
 */
public class RotateString {
    public static void main(String [] args){
        char [] c = {'a', 'c', 'h', 'l'};
        rotateString(c, 4);
    }
    public static void rotateString(char [] str, int offset){
        if(str != null && str.length != 0){
            if(offset >= 0){
                offset %= str.length;
                char [] temp = new char[offset];
                int start = str.length - offset, pos = 0;

                /**
                 * 保存后offset位
                 */
                for (int i = start; i < str.length; i++) {
                    temp[pos] = str[i];
                    pos++;
                }

                /**
                 * 从start - 1开始后移offset
                 */
                for (int i = start - 1; i >= 0; i--) {
                    str[i + offset] = str[i];
                }

                /**
                 * 保存的temp放到最前面
                 */
                for (int i = 0; i < offset; i++) {
                    str[i] = temp[i];
                }
                System.out.println(str);
            }
        }
    }
}
