## LintCode
### 375. <a href="http://www.lintcode.com/zh-cn/problem/clone-binary-tree/"> Clone BinaryTree (Easy) </a>

```java

package Test_375_CloneBinaryTree_easy;

/**
 * Created by zmt on 2017/7/13.
 */
public class CloneBinaryTree {
    public static void main(String [] args){

    }

    public TreeNode cloneBinaryTree(TreeNode root){
        if(root != null){
            TreeNode cloneRoot = new TreeNode(root.val);
            traversal(root, cloneRoot);
            return cloneRoot;
        }
        return null;
    }

    public void traversal(TreeNode root, TreeNode cloneRoot){
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left != null){
            cloneRoot.left = new TreeNode(root.left.val);
            traversal(root.left, cloneRoot.left);
        }
        if(root.right != null){
            cloneRoot.right = new TreeNode(root.right.val);
            traversal(root.right, cloneRoot.right);
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