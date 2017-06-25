package Test_039_RecoverRotatedSortedArray_easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/6/25.
 */
public class RecoverRotatedSortedArray {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        recover(list);
    }
    public static void recover(ArrayList<Integer> list){
        if(list != null && list.size() != 0){
            int pre = 0;
            boolean recover = false;
            int length = list.size();
            int [] temp = new int[length];
            temp[0] = list.get(0);
            int i;
            for (i = 1; i < length; i++) {
                if(recover || list.get(pre) > list.get(i)){
                    recover = true;
                    list.set(i - pre - 1, list.get(i));
                } else {
                    temp[i] = list.get(i);
                    pre = i;
                }
            }
            if(recover){
                int start = i - pre - 1;
                for (int j = start; j < length; j++) {
                    list.set(j, temp[j - start]);
                }
            }
        }
    }
}
