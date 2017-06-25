package Test_632_BinaryTreeMaxNode_naive;

/**
 * Created by zmt on 2017/6/23.
 */
public class BinaryTreeMaxNode {
    /**
     * @param root the root of binary tree
     * @return the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
        if(root != null){
            TreeNode left = maxNode(root.left);
            TreeNode right = maxNode(root.right);
            return max(root, max(left, right));
        }
        return null;
    }

    public TreeNode max(TreeNode left, TreeNode right){
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
//        if(left.val > right.val){
//            return left;
//        }
        return right;
    }
}

class TreeNode {
    public int value;
    public TreeNode left, right;
    public TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
