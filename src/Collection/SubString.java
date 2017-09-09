package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmt on 2017/9/5.
 */
public class SubString {
    public static void main(String [] args){
        System.out.println(longestNoRepeatingSubString("12345267809121"));
    }
    public static String longestNoRepeatingSubString(String string){
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int maxLength = 0;
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                if(val + 1 > start){
                    start = val + 1;
                }
            }
            map.put(ch, i);
            end++;
            if(maxLength < end - start){
                maxLength = end - start;
                if(end == string.length()){
                    result = string.substring(start);
                } else {
                    result = string.substring(start, end);
                }
            }
        }
        return result;
    }
}
