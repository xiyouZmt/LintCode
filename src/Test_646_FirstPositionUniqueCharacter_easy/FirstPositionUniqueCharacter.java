package Test_646_FirstPositionUniqueCharacter_easy;

import java.util.*;

/**
 * Created by zmt on 2017/7/15.
 */
public class FirstPositionUniqueCharacter {
    public static void main(String [] args){
        System.out.println(firstUniqChar("lovelintcode"));
    }
    /**
     * @param s a string
     * @return it's index
     */
    public static int firstUniqChar(String s){
        if(s == null || s.length() == 0){
            return -1;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1){
                return i;
            }
        }
        return -1;
    }
}
