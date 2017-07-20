package Test_155_MinimumDepthOfBinaryTree_easy;

/**
 * Created by zmt on 2017/7/20.
 */
public class MinimumDepthOfBinaryTree {
    public static void main(String [] args){

    }
    public int minDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0){
            return right + 1;
        }
        if(right == 0){
            return left + 1;
        }
        return left < right ? left + 1 : right + 1;
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
