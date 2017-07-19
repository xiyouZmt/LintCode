## LintCode
### 30. <a href="http://www.lintcode.com/problem/insert-interval"> Insert Interval (Easy) </a>

```java

package Test_030_InsertInterval_easy;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by zmt on 2017/6/24.
 */
public class InsertInterval {
    public static void main(String [] args){

    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if(intervals == null || newInterval == null){
            return intervals;
        }
        if(intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }
        intervals.add(newInterval);
        intervals.sort(Comparator.comparingInt(o -> o.start));
        ArrayList<Interval> result = new ArrayList<>();
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

```java
/*
package Test_030_InsertInterval_easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/6/24.
 */
public class InsertInterval {
    public static void main(String [] args){

    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){
        if(intervals == null || newInterval == null){
            return null;
        }
        if(intervals.size() == 0){
            intervals.add(newInterval);
        }
        if(newInterval.start > newInterval.end){
            return intervals;
        }
        int start, end;
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if(newInterval.start < interval.start){
                if(newInterval.end < interval.start){
                    intervals.add(i, newInterval);
                    break;
                } else {
                    start = newInterval.start;
                    if(newInterval.end > interval.end){
                        end = newInterval.end;
                        intervals.remove(interval);
                        newInterval = new Interval(start, end);
                        i--;
                        if(i == intervals.size() - 1){
                            intervals.add(newInterval);
                            break;
                        }
                    } else {
                        end = interval.end;
                        intervals.remove(interval);
                        intervals.add(i, new Interval(start, end));
                        break;
                    }
                }
            } else {
                if(newInterval.start <= interval.end){
                    start = interval.start;
                    if(newInterval.end > interval.end){
                        end = newInterval.end;
                        intervals.remove(interval);
                        newInterval = new Interval(start, end);
                        i--;
                        if(i == intervals.size() - 1){
                            intervals.add(newInterval);
                        }
                    }
                } else {
                    if(i == intervals.size() - 1){
                        intervals.add(newInterval);
                        break;
                    }
                }
            }
        }
        return intervals;
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
*/
```