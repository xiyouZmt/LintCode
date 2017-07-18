## LintCode
### 420. <a href="http://www.lintcode.com/en/problem/count-and-say/"> CountAndSay (Easy) </a>

```java

package Test_420_CountAndSay_easy;

/**
 * Created by zmt on 2017/7/14.
 */
public class CountAndSay {
    public static void main(String [] args){
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        // Write your code here
        if(n < 1){
            return "";
        }
        int counts = 1;
        String num = "1";
        StringBuilder builder = new StringBuilder();
        while (counts < n){
            int start = num.charAt(0) - 48;
            int count = 1;
            if(num.equals("1")){
                num = "11";
            } else {
                for (int i = 1; i < num.length(); i++){
                    int k = num.charAt(i) - 48;
                    if(k == start){
                        count++;
                    } else {
                        builder.append(count).append(start);
                        start = k;
                        count = 1;
                    }
                }
                builder.append(count).append(start);
                num = builder.toString();
                builder.delete(0, builder.length());
            }
            counts++;
        }
        return num;
    }
}

```