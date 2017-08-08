## LintCode
### 211. <a href="http://www.lintcode.com/en/problem/string-permutation/"> String Permutation (Easy) </a>

### 思路1. 两个数组排序后比较是否相等
### 思路2. hash
### 思路3. 数组比较(最优解)

```java

package Test_211_StringPermutation_easy;

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
        if(A.equals(B)){
            return true;
        }
        if (A.length() == B.length()) {
            /**
             * Version 1. 数组
             */
            int [] count = new int[256];
            for (int i = 0; i < A.length(); i++) {
                count[A.charAt(i)]++;
            }
            for (int i = 0; i < B.length(); i++) {
                count[B.charAt(i)]--;
                if(count[B.charAt(i)] < 0){
                    return false;
                }
            }
            return true;

//            version 2. Hash
//            Map<Character, Integer> map = new HashMap<>();
//            for(int i = 0; i < A.length(); i++){
//                char a = A.charAt(i);
//                if(map.containsKey(a)){
//                    int val = map.get(a);
//                    if(val + 1 == 0){
//                        map.remove(a);
//                    } else {
//                        map.put(a, val + 1);
//                    }
//                } else {
//                    map.put(a, 1);
//                }
//
//                char b = B.charAt(i);
//                if(map.containsKey(b)){
//                    int val = map.get(b);
//                    if(val - 1 == 0){
//                        map.remove(b);
//                    } else {
//                        map.put(b, val - 1);
//                    }
//
//                } else {
//                    map.put(b, -1);
//                }
//            }
//            return map.size() == 0;
        } else {
            return false;
        }
    }
}

```