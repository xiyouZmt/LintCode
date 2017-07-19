package Test_97_MaximumDepthOfBinaryTree_easy;

/**
 * Created by zmt on 2017/7/19.
 */
public class MaximumDepthOfBinaryTree {
    public static void main(String [] args){

    }
    public int maxDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
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
