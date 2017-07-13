## LintCode
### 66. <a href="http://www.lintcode.com/en/problem/binary-tree-preorder-traversal/"> Binary Tree Preorder Traversal (Easy) </a>

```java

package Test_066_BinaryTreePreorderTraversal_Easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/7/11.
 */
public class BinaryTreePreorderTraversal {

    private ArrayList<Integer> list = new ArrayList<>();

    public static void main(String [] args){

    }

    public ArrayList<Integer> preOrderTraversal(TreeNode root){
        if(root != null){
            list.add(root.val);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        return list;
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