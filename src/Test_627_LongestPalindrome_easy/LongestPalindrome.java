package Test_627_LongestPalindrome_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zmt on 2017/7/18.
 */
public class LongestPalindrome {
    public static void main(String [] args){
        System.out.println(longestPalindrome("eRWySdWcfyrSSTfgofkPSZzLqjZVetHduutZtuypMBMKkwqyRJYLhyvavjbVPyLtdl"));
    }
    public static int longestPalindrome(String s) {
        // Write your code here
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        boolean hasOne = false;
        int count = 0;
        for (int i : values) {
            if(i % 2 == 0){
                count += i;
            } else{
                count += (i - 1);
                hasOne = true;
            }
        }
        if(hasOne){
            count++;
        }
        return count;
    }
}
