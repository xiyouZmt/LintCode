## LintCode
### 128. <a href="http://www.lintcode.com/en/problem/hash-function/"> HashFunction (Easy) </a>

```java

package Test_128_HashFunction_easy;

/**
 * Created by zmt on 2017/7/16.
 */
public class HashFunction {
    public static void main(String [] args){
        char [] key = {'a', 'b', 'c', 'd'};
        System.out.println(hashCode(key, 100));
    }
    public static int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        if(key == null || key.length == 0){
            return -1;
        }
        long hash = 0;
        for(int i = 0; i < key.length; i++){
            hash = (key[i] + 33 * hash) % HASH_SIZE;
        }
        return (int)hash;
    }
}

```