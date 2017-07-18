## LintCode
### 175. <a href="http://www.lintcode.com/en/problem/invert-binary-tree/"> Invert Binary Tree (Easy) </a>

```java

package Test_175_InvertBinaryTree_easy;

/**
 * Created by zmt on 2017/7/18.
 */
public class InvertBinaryTree {
    public static void main(String [] args){

    }

    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertBinaryTree(root.left);
            invertBinaryTree(root.right);
        }
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