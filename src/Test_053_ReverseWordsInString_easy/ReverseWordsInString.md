## LintCode
### 53. <a href="http://www.lintcode.com/en/problem/reverse-words-in-a-string/"> Reverse Words in a String (Easy) </a>

```java

package Test_053_ReverseWordsInString_easy;

/**
 * Created by zmt on 2017/7/23.
 */
public class ReverseWordsInString {
    public static void main(String [] args){
        System.out.println(reverseWords("the sky is blue "));
    }
//    public static String reverseWords(String s) {
//        // write your code
//        if(s == null || s.equals("")){
//            return s;
//        }
//        StringBuilder builder = new StringBuilder();
//        List<String> list = new ArrayList<>();
//        char c;
//        int i;
//        for(i = 0; i < s.length(); i++){
//            c = s.charAt(i);
//            if(c == ' '){
//                if(builder.length() != 0){
//                    list.add(builder.toString());
//                    builder.delete(0, builder.length());
//                }
//            } else {
//                builder.append(c);
//            }
//        }
//
//        if(s.charAt(i - 1) != ' '){
//            builder.append(" ");
//        }
//        for(i = list.size() - 1; i >= 0; i--){
//            builder.append(list.get(i));
//            if(i != 0){
//                builder.append(" ");
//            }
//        }
//        return builder.toString();
//    }

    public static String reverseWords(String s){
        if(s == null || s.length() == 0){
            return null;
        }
        StringBuilder builder = new StringBuilder();
        String [] words = s.split(" +");
        for (int i = words.length - 1; i >= 0; i--) {
            if(!words[i].equals("")){
                builder.append(words[i]);
            }
        }
        return builder.toString();
    }
}

```