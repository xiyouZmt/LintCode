## LintCode
### 211. <a href="http://www.lintcode.com/en/problem/string-permutation/"> String Permutation (Easy) </a>

### 思路1. 两个数组排序后比较是否相等
### 思路2. hash

```java

package Test_211_StringPermutation_easy;

/**
 * Created by zmt on 2017/6/21.
 */
public class StringPermutation {
    public static void main(String[] args) {
        String A = "lliinnttccooddee";
        String B = "lintcodelintcode";
        System.out.println(stringPermutation(A, B));
    }

    public static boolean stringPermutation(String A, String B) {
        // Write your code here
        if (A == null || B == null) {
            return false;
        }
        if (A.length() == B.length()) {
            char [] temp = B.toCharArray();
            for (int i = 0; i < A.length(); i++) {
                int j;
                for (j = 0; j < temp.length; j++) {
                    if (A.charAt(i) == temp[j]) {
                        temp[j] = ' ';
                        break;
                    }
                }
                if(j == temp.length){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

```