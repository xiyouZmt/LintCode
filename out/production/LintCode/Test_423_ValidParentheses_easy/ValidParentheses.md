## LintCode
### 423. <a href="http://www.lintcode.com/en/problem/valid-parentheses/"> Valid Parentheses (Easy) </a>

```java

package Test_423_ValidParentheses_easy;

import java.util.Stack;

/**
 * Created by zmt on 2017/7/27.
 */
public class ValidParentheses {
    public static void main(String [] args){
        System.out.println(isValidParentheses("((([[[{{{}}}]]])))"));
    }

    public static boolean isValidParentheses(String s) {
        // Write your code here
        if(s == null || s.length() == 0){
            return false;
        }
        int length = s.length();
        if(length % 2 == 0){
            Stack<Character> stack = new Stack<>();
            for(char c : s.toCharArray()){
                if(c == '[' || c == '{' || c == '('){
                    stack.push(c);
                    continue;
                }
                if(stack.isEmpty()){
                    return false;
                }
                if(c == ']' && stack.pop() != '['){
                    return false;
                }
                if(c == '}' && stack.pop() != '{'){
                    return false;
                }
                if(c == ')' && stack.pop() != '('){
                    return false;
                }
            }
            return stack.isEmpty();
        } else {
            return false;
        }
    }
}

```