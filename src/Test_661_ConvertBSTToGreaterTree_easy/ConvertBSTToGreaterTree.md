## LintCode
### 661. <a href="http://www.lintcode.com/zh-cn/problem/convert-bst-to-greater-tree/"> Convert BST to Greater Tree (Easy) </a>

```java

package Test_661_ConvertBSTToGreaterTree_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/14.
 */
public class ConvertBSTToGreaterTree {

    private static List<Integer> BSTValue = new ArrayList<>();
    private  static int i = 0;

    public static void main(String [] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        convertBST(root);
    }

    public static TreeNode convertBST(TreeNode root){
        if(root != null){
            convertValue(traversal(root));
            convertBSTValue(root, BSTValue);
        }
        return root;
    }

    public static List<Integer> traversal(TreeNode root){
        if(root != null){
            traversal(root.left);
            BSTValue.add(root.val);
            traversal(root.right);
        }
        return BSTValue;
    }

    public static void convertValue(List<Integer> BSTValue){
        int convertValue = BSTValue.get(BSTValue.size() - 1);
        int originalValue;
        for (int i = BSTValue.size() - 2; i >= 0; i--) {
            originalValue = BSTValue.get(i);
            convertValue += originalValue;
            BSTValue.set(i, convertValue);
        }
    }

    public  static void convertBSTValue(TreeNode root, List<Integer> BSTValue){
        if(root != null){
            convertBSTValue(root.left, BSTValue);
            root.val = BSTValue.get(i);
            i++;
            convertBSTValue(root.right, BSTValue);
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