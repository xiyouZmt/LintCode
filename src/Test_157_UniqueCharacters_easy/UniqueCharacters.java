package Test_157_UniqueCharacters_easy;

/**
 * Created by zmt on 2017/7/26.
 */
public class UniqueCharacters {
    public static void main(String [] args){
        System.out.println(isUnique("abcdb"));
    }

//    public static boolean isUnique(String str) {
//        // write your code here
//        if(str == null){
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < str.length(); i++){
//            if(map.containsKey(str.charAt(i))){
//                return false;
//            }
//            map.put(str.charAt(i), i);
//        }
//        return true;
//    }

    public static boolean isUnique(String str) {
        // write your code here
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
