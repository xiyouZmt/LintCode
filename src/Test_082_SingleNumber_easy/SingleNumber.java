package Test_082_SingleNumber_easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zmt on 2017/7/24.
 */
public class SingleNumber {
    public static void main(String [] args){
        int [] A = {1,2,2,1,3,4,3};
        System.out.println(singleNumber(A));
    }
    public static int singleNumber(int[] A) {
        // Write your code here
        if(A == null){
            return -1;
        }
        if(A.length == 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                map.remove(A[i]);
            } else {
                map.put(A[i], 1);
            }
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        return iterator.next();
    }
}
