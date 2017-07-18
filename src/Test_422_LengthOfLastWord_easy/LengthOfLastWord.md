## LintCode
### 422. <a href="http://www.lintcode.com/en/problem/length-of-last-word/"> Length of Last Word (Easy) </a>

```java

package Test_422_LengthOfLastWord_easy;

/**
 * Created by zmt on 2017/7/18.
 */
public class LengthOfLastWord {
    public static void main(String [] args){
        System.out.println(lengthOfLastWord("b a     "));
    }
    public static int lengthOfLastWord(String s) {
        // Write your code here
        if(s == null){
            return -1;
        }
        int count = 0;
        boolean start = false;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                if(!start){
                    start = true;
                }
                count++;
            } else {
                if(start){
                    break;
                }
            }
        }
        return count;
    }
}

```
