## LintCode
### 245. <a href="http://www.lintcode.com/en/problem/subtree/"> SubTree (Easy) </a>

```java

package Test_245_SubTree_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/25.
 */
public class SubTree {

    private static List<TreeNode> rootList = new ArrayList<>();

    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(4);
        System.out.println(isSubtree(root, root2));
    }
    public static boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if(T2 == null){
            return true;
        }
        if(T1 == null){
            return false;
        }
        addRoot(T1, T2);
        for(TreeNode root : rootList){
            if(sameTree(root, T2)){
                return true;
            }
        }
        return false;
    }

    public static void addRoot(TreeNode t1, TreeNode t2){
        if(t1 != null && t2 != null){
            if(t1.val == t2.val){
                rootList.add(t1);
            }
            addRoot(t1.left, t2);
            addRoot(t1.right, t2);
        }
    }

    public static boolean sameTree(TreeNode root1, TreeNode root2){
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
            } else {
                return false;
            }
        } else {
            return root1 == null && root2 == null;
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