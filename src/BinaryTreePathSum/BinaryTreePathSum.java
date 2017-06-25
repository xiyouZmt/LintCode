package BinaryTreePathSum;

/**
 * Created by zmt on 2017/6/11.
 */
public class BinaryTreePathSum {

    private int leftDepth = 0 , rightDepth = 0;

    public static void main(String [] args){
        String text = "";
    }

    /**
     * 二叉树的深度
     * @param treeNode
     * @return
     */
    public int treeDepth(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        int left = treeDepth(treeNode.getLeft());
        int right = treeDepth(treeNode.getRight());
        return  left > right ? left + 1 : right + 1;
    }

    /**
     * 判断平衡二叉树 (深度递归)
     * @param treeNode
     * @return
     */
    public boolean isBalanced(TreeNode treeNode){
        if(treeNode == null){
            return false;
        }
        int left = treeDepth(treeNode.getLeft());
        int right = treeDepth(treeNode.getRight());
        int distance = left - right;
        if(distance > 1 || distance < -1){
            return false;
        }
        return isBalanced(treeNode.getLeft()) && isBalanced(treeNode.getRight());
    }

    /**
     * 判断平衡二叉树(深度非递归)
     * @param treeNode
     * @param depth
     * @return
     */
//    public boolean isBalanced(TreeNode treeNode, int depth){

//    }

}
class TreeNode{
    private int val;
    private TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
