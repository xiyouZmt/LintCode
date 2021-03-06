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
