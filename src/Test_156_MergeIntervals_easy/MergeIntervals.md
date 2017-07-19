## LintCode
### 156. <a href="http://www.lintcode.com/en/problem/merge-intervals/"> Merge Intervals (Easy) </a>

```java

package Test_156_MergeIntervals_easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zmt on 2017/7/19.
 */
public class MergeIntervals {
    public static void main(String [] args){

    }

    public static List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if(intervals == null || intervals.size() == 0 || intervals.size() == 1){
            return intervals;
        }
        intervals.sort(Comparator.comparingInt(o -> o.start));
        List<Interval> result = new ArrayList<>();
        Interval last = intervals.get(0);
        for(int i = 1; i < intervals.size(); i++){
            Interval curr = intervals.get(i);
            if(curr.start <= last.end){
                last.end = Math.max(last.end, curr.end);
            } else {
                result.add(last);
                last = curr;
            }
        }
        result.add(last);
        return result;
    }
}

/**
 * Definition of Interval:
 */
class Interval {
    int start,end;
    Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}

```