## LintCode
### 55. <a href="http://www.lintcode.com/en/problem/compare-strings/"> Compare Strings (Easy) </a>

```java

package Test_055_CompareStrings_easy;

/**
 * Created by zmt on 2017/7/13.
 */
public class CompareStrings {
    public static void main(String [] args){
        System.out.println(compareStrings("ABC", "ABC"));
    }

//    public static boolean compareStrings(String A, String B){
//        if(A == null && B == null){
//            return false;
//        } else if(A == null){
//            return false;
//        } else if(B == null){
//            return true;
//        } else {
//            if(A.length() < B.length()){
//                return false;
//            } else {
//                StringBuilder builderA = new StringBuilder(A);
//                StringBuilder builderB = new StringBuilder(B);
//                for (int i = 0; i < builderB.length();) {
//                    int j;
//                    for (j = 0; j < builderA.length(); j++) {
//                        if(builderB.charAt(i) == builderA.charAt(j)){
//                            builderA.deleteCharAt(j);
//                            builderB.deleteCharAt(i);
//                            break;
//                        }
//                    }
//                    if(builderB.length() != 0 && j == builderA.length()){
//                        return false;
//                    }
//                }
//                return true;
//            }
//        }
//    }

    public static boolean compareStrings(String A, String B) {
        if(A == null && B == null){
            return false;
        } else if(A == null){
            return false;
        } else if(B == null){
            return true;
        } else {
            int[] counts = new int[26];
            for (int i = 0; i < 26; i++) {
                counts[i] = 0;
            }
            for (int i = 0; i < A.length(); i++) {
                counts[A.charAt(i) - 'A'] ++;
            }
            for (int i = 0; i < B.length(); i++) {
                counts[B.charAt(i) - 'A'] --;
                if (counts[B.charAt(i) - 'A'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

```