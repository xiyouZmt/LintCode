package Test_211_StringPermutation_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmt on 2017/6/21.
 */
public class StringPermutation {
    public static void main(String[] args) {
        String A = "lliinnttccooddee";
        String B = "lintcodelintcode";
        System.out.println(permutation(A, B));
    }

    public static boolean permutation(String A, String B) {
        // Write your code here
        if (A == null || B == null) {
            return false;
        }
        if (A.length() == B.length()) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < A.length(); i++){
                char a = A.charAt(i);
                if(map.containsKey(a)){
                    int val = map.get(a);
                    if(val + 1 == 0){
                        map.remove(a);
                    } else {
                        map.put(a, val + 1);
                    }
                } else {
                    map.put(a, 1);
                }

                char b = B.charAt(i);
                if(map.containsKey(b)){
                    int val = map.get(b);
                    if(val - 1 == 0){
                        map.remove(b);
                    } else {
                        map.put(b, val - 1);
                    }

                } else {
                    map.put(b, -1);
                }
            }
            return map.size() == 0;
        } else {
            return false;
        }
    }
}
