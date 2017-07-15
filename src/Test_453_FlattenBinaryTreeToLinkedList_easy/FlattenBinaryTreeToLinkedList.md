## LintCode
### 453. <a href="http://www.lintcode.com/en/problem/flatten-binary-tree-to-linked-list/"> Flatten Binary Tree to Linked List (Easy) </a>

```java

package Test_453_FlattenBinaryTreeToLinkedList_easy;

/**
 * Created by zmt on 2017/7/15.
 */
public class FlattenBinaryTreeToLinkedList {

    private TreeNode lastNode;

    public static void main(String [] args){

    }

    public void flatten(TreeNode root) {
        // write your code here
        if (root != null){
            if (lastNode != null){
                lastNode.left = null;
                lastNode.right = root;      //这里会覆盖掉之前的右子树
            }
            lastNode = root;
            TreeNode right = root.right;    //所以要提前保存右子树
            flatten(root.left);
            flatten(right);
        }
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

```