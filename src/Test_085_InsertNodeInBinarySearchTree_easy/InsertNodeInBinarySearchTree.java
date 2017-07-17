package Test_085_InsertNodeInBinarySearchTree_easy;

/**
 * Created by zmt on 2017/7/17.
 */
public class InsertNodeInBinarySearchTree {
    public static void main(String [] args){

    }
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null){
            return node;
        }
        if(node.val < root.val){
            if(root.left == null){
                root.left = node;
            } else {
                insertNode(root.left, node);
            }
        } else {
            if(root.right == null){
                root.right = node;
            } else {
                insertNode(root.right, node);
            }
        }
        return root;
    }
}

/**
 * Definition of TreeNode:
 */
class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
