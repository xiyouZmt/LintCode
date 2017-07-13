## LintCode
### 22. <a href="http://www.lintcode.com/problem/flatten-list"> Flatten List (Easy) </a>

```java

package Test_022_FlattenList_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/6/24.
 */
public class FlattenList {
    public static void main(String [] args){

    }
    public List<Integer> flatten(List<NestedInteger> nestedList){
        if(nestedList == null){
            return null;
        }
        List<Integer> flattenList = new ArrayList<>();
        for (NestedInteger nestedIntegers: nestedList){
            if(nestedIntegers.isInteger()){
                flattenList.add(nestedIntegers.getInteger());
            } else {
                List<Integer> suffixList = flatten(nestedIntegers.getList());
                flattenList.addAll(suffixList);
            }
        }
        return flattenList;
    }
}

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {
    // @return true if this NestedInteger holds a single integer,
    // rather than a nested list.
    boolean isInteger();
    // @return the single integer that this NestedInteger holds,
    // if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    Integer getInteger();
    // @return the nested list that this NestedInteger holds,
    // if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    List<NestedInteger> getList();
}

```