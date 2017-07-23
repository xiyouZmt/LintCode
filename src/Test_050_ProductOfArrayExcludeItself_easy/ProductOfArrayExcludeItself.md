## LintCode
### 50. <a href="http://www.lintcode.com/en/problem/product-of-array-exclude-itself/"> Product of Array Exclude Itself (Easy) </a>

```java

package Test_050_ProductOfArrayExcludeItself_easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/7/23.
 */
public class ProductOfArrayExcludeItself {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(productExcludeItself(list));
    }

    public static ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        if (A == null){
            return null;
        }
        ArrayList<Long> list = new ArrayList<>();
        if (A.size() == 1){
            list.add(1L);
            return list;
        }
        int length = A.size();
        long [] temp = new long [length];
        temp[length - 1] = 1;

        long next = 1;
        for (int i = length - 2; i >= 0; i--){
            temp[i] = A.get(i + 1) * next;
            next = temp[i];
        }
        long before = 1;
        for (int i = 0; i < A.size(); i++){
            list.add(temp[i] * before);
            before *= A.get(i);
        }
        return list;
    }
}

```