## LintCode
### 133. <a href="http://www.lintcode.com/en/problem/longest-words/"> Longest Words (Easy) </a>

```java

package Test_133_LongestWords_easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/7/19.
 */
public class LongestWords {
    public static void main(String [] args){
        String [] dictionary ={"dog",
                "google",
                "facebook",
                "internationalization",
                "blabla"};
        longestWords(dictionary);
    }
    public static ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> longestWords = new ArrayList<>();
        if(dictionary == null || dictionary.length == 0){
            return longestWords;
        }
        String temp = dictionary[0];
        for(String str : dictionary){
            if(str.length() > temp.length()){
                longestWords.clear();
                longestWords.add(str);
                temp = str;
            } else if(str.length() == temp.length()){
                longestWords.add(str);
            }
        }
        return longestWords;
    }
}

```