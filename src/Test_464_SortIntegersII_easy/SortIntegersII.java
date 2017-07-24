package Test_464_SortIntegersII_easy;

/**
 * Created by zmt on 2017/7/24.
 */
public class SortIntegersII {
    public static void main(String [] args){
        int [] A = {3, 2, 1, 4, 5};
        sortIntegers2(A);
    }

    public static void sortIntegers2(int[] A) {
        // Write your code here
        if(A != null && A.length != 0){
            quickSort(A, 0, A.length - 1);
        }
    }

    public static void quickSort(int [] A, int left, int right){
        int temp;
        if(left < right){
            temp = quickPass(A, left, right);
            quickSort(A, left, temp - 1);
            quickSort(A, temp + 1, right);
        }
    }

    public static int quickPass(int [] A, int left, int right){
        if(A != null && A.length != 0){
            int target = A[left];
            while(left < right){
                while(left < right && A[right] >= target){
                    right--;
                }
                A[left] = A[right];
                while(left < right && A[left] < target){
                    left++;
                }
                A[right] = A[left];
            }
            A[left] = target;
            return left;
        }
        return -1;
    }
}
