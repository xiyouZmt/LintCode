package Collection;

import java.util.Arrays;

/**
 * Created by zmt on 2017/8/28.
 */
public class HeapSort {
    public static void main(String [] args){
        int [] array = {9,8,1,2,3,4,7,5};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 堆排序
     */
    private static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--){                  /**将待排序的序列构建成一个大顶堆*/
            heapAdjust(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {                      /**逐步将每个最大值的根节点与末尾元素交换，并且再调整二叉树，使其成为大顶堆*/
            swap(arr, 0, i);                                     /**将堆顶记录和当前未经排序子序列的最后一个记录交换*/
            heapAdjust(arr, 0, i);                                    /**交换之后，需要重新检查堆是否符合大顶堆，不符合则要调整*/
        }
    }

    /**
     * 构建堆的过程
     * @param arr 需要排序的数组
     * @param i 需要构建堆的根节点的序号
     * @param n 数组的长度
     */
    private static void heapAdjust(int[] arr, int i, int n) {
        int child;
        int father;
        for (father = arr[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && arr[child] < arr[child + 1]) {        /**如果左子树小于右子树，则需要比较右子树和父节点*/
                child++;                                                /**序号增1，指向右子树*/
            }
            if (father < arr[child]) {                                  /**如果父节点小于孩子结点，则需要交换*/
                arr[i] = arr[child];
            } else {
                break;                                                  /**大顶堆结构未被破坏，不需要调整*/
            }
        }
        arr[i] = father;
    }

    /**
     * 获取到左孩子结点
     * @param i
     * @return
     */
    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    /**
     * 交换元素位置
     * @param arr
     * @param index1
     * @param index2
     */
    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
