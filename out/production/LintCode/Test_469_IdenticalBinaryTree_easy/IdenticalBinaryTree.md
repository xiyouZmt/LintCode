## LintCode
### 469. <a href="http://www.lintcode.com/en/problem/identical-binary-tree/"> Identical Binary Tree (Easy) </a>

```java

package Test_469_IdenticalBinaryTree_easy;

/**
 * Created by zmt on 2017/7/17.
 */
public class IdenticalBinaryTree {
    public static void main(String [] args){

    }
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if(a != null && b != null){
            if(a.val == b.val){
                return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
            } else {
                return false;
            }
        } else if(a == null && b == null) {
            return true;
        } else {
            return false;
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
