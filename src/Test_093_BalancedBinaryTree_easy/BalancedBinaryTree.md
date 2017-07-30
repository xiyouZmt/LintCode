## LintCode
### 93. <a href="http://www.lintcode.com/en/problem/balanced-binary-tree/"> Balanced Binary Tree (Easy) </a>

```java

package Test_093_BalancedBinaryTree_easy;

/**
 * Created by zmt on 2017/  6/11.
 */
public class BalancedBinaryTree {

    private boolean result = true;

    public static void main(String [] args){

    }

//    /**
//     * 二叉树的深度
//     * @param treeNode
//     * @return
//     */
//    public int treeDepth(TreeNode treeNode){
//        if(treeNode == null){
//            return 0;
//        }
//        int left = treeDepth(treeNode.left);
//        int right = treeDepth(treeNode.right);
//        return  left > right ? left + 1 : right + 1;
//    }
//
//    /**
//     * 判断平衡二叉树 (深度递归)
//     * @param treeNode
//     * @return
//     */
//    public boolean isBalanced(TreeNode treeNode){
//        if(treeNode == null){
//            return true;
//        }
//        int left = treeDepth(treeNode.left);
//        int right = treeDepth(treeNode.right);
//        int distance = left - right;
//        if(distance > 1 || distance < -1){
//            return false;
//        }
//        return isBalanced(treeNode.left) && isBalanced(treeNode.right);
//    }

    /**
     * 判断平衡二叉树(每个节点只遍历一次)
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root){
        getDepth(root);
        return result;
    }

    public int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if(Math.abs(left - right) > 1){
            result = false;
        }
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

```