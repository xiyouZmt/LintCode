package Test_463_SortIntegers_easy;

import java.util.Arrays;

/**
 * Created by zmt on 2017/7/29.
 */
public class SortIntegers {
    public static void main(String [] args){
        int [] A = {4,3,5,7,12,9,0};
        sortIntegers(A);
        System.out.println(Arrays.toString(A));
    }

    public static void sortIntegers(int[] A) {
        // Write your code here
        if(A != null && A.length != 0){
            for(int i = 1; i < A.length; i++){
                if(A[i] < A[i - 1]){
                    int temp = A[i];
                    int j;
                    for(j = i - 1; j >= 0; j--){
                        if(A[j] > temp){
                            A[j + 1] = A[j];
                        } else {
                            break;
                        }
                    }
                    A[j + 1] = temp;
                }
            }
        }
    }
}
