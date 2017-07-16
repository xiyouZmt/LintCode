## LintCode
### 662. <a href="http://www.lintcode.com/zh-cn/problem/guess-number-game/"> Guess Number Game (Easy) </a>

```java

package Test_662_GuessNumberGame_easy;

/**
 * Created by zmt on 2017/7/16.
 */
public class GuessNumberGame {
    public static void main(String [] args){

    }
    public int guessNumber(int n) {
        // Write your code here

        int start = 1;
        long end = n;
        int middle = (int)((start + end) / 2);
        while(start <= end){
            if(guess(middle) == 0){
                return middle;
            } else if(guess(middle) < 0){
                end = middle - 1;
                middle = (int)((start + end) / 2);
            } else {
                start = middle + 1;
                middle = (int)((start + end) / 2);
            }
        }
        return -1;
    }

    //这个方法没啥用，为了不报错
    public int guess(int n){
        return 0;
    }
}

```