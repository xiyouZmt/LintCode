package Test_158_TwoStringsAreAnagrams_easy;

/**
 * Created by zmt on 2017/7/26.
 */
public class TwoStringsAreAnagrams {

    public static void main(String [] args){
        System.out.println(anagram("abcd", "dcab"));
    }

    public static boolean anagram(String s, String t) {
        // write your code here
        if(s == null && t == null){
            return true;
        } else if(s != null && t != null){
            int sLength = s.length();
            int tLength = t.length();
            if(sLength != tLength){
                return false;
            } else if(sLength == 0){
                return true;
            } else {
                int [] count = new int[256];
                for(int i = 0; i < s.length(); i++){
                    count[s.charAt(i)]++;
                }
                for(int i = 0; i < t.length(); i++){
                    count[t.charAt(i)]--;
                    if(count[t.charAt(i)] < 0){
                        return false;
                    }
                }
                return true;
//                StringBuilder builder = new StringBuilder(t);
//                int index;
//                for(int i = 0; i < sLength; i++){
//                    if((index = builder.indexOf(s.charAt(i) + "")) >= 0){
//                        builder.deleteCharAt(index);
//                        if(builder.length() == 0 && i == sLength - 1){
//                            return true;
//                        }
//                    } else {
//                        return false;
//                    }
//                }
//                return false;
            }
        } else {
            return false;
        }
    }
}
