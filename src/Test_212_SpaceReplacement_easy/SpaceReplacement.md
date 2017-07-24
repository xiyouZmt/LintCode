## LintCode
### 212. <a href="http://www.lintcode.com/en/problem/space-replacement/"> Space Replacement (Easy) </a>

```java

package Test_212_SpaceReplacement_easy;

/**
 * Created by zmt on 2017/7/24.
 */
public class SpaceReplacement {
    public static void main(String [] args){
        String str = "Mr John Smith";
        char [] string = new char[100];
        for (int i = 0; i < str.length(); i++) {
            string[i] = str.charAt(i);
        }
        System.out.println(replaceBlank(string, str.length()));
        System.out.println(string);
    }
    public static int replaceBlank(char[] string, int length) {
        // Write your code here
        if(string == null || string.length == 0){
            return -1;
        }
        int spaceCount = 0;
        for (char c : string) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        int newLength = spaceCount * 2 + length;
        int p1 = length - 1;
        int p2 = newLength - 1;
        while(p1 < p2 && p1 >= 0){
            if(string[p1] == ' '){
                string[p2--] = '0';
                string[p2--] = '2';
                string[p2--] = '%';
            } else {
                string[p2--] = string[p1];
            }
            p1--;
        }
        return newLength;
    }
}

```
