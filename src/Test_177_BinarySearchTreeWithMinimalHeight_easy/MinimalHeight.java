package Test_177_BinarySearchTreeWithMinimalHeight_easy;

import java.util.Arrays;

/**
 * Created by zmt on 2017/7/14.
 */
public class MinimalHeight {
    public static void main(String [] args){
        int [] A =  {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = sortedArrayToBST(A);
        if(root != null){
            System.out.println(root.val);
        } else {
            System.out.println("{}");
        }
    }

    public static TreeNode sortedArrayToBST(int [] A){
        if(A == null || A.length == 0){
            return null;
        }
        int middle = A.length / 2;
        if(middle == 0){
            return new TreeNode(A[0]);
        }
        TreeNode root = new TreeNode(A[middle]);
        TreeNode left = sortedArrayToBST(Arrays.copyOfRange(A, 0, middle));
        TreeNode right = sortedArrayToBST(Arrays.copyOfRange(A, middle + 1, A.length));
        root.left = left;
        root.right = right;
        return root;
    }
}

/**
 * Definition of TreeNode
 */
class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
