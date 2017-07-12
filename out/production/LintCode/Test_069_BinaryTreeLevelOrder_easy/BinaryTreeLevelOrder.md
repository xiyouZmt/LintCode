## LintCode
### 69. [BinaryTreeLevelOrder (Easy)](http://www.lintcode.com/en/problem/binary-tree-level-order-traversal/)

```java

package Test_069_BinaryTreeLevelOrder_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/8.
 */
public class BinaryTreeLevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root != null){
            List<TreeNode> rootList = new ArrayList<>();
            rootList.add(root);

            ArrayList<Integer> rootInteger = new ArrayList<>();
            rootInteger.add(root.val);
            list.add(rootInteger);

            List<TreeNode> childList = new ArrayList<>();
            List<TreeNode> tempList;
            while (true){
                int nullCount = 0, size = rootList.size();
                ArrayList<Integer> integerList = new ArrayList<>();
                for(int i = 0; i < size; i++){
                    TreeNode treeNode = rootList.get(i);
                    if(treeNode.left == null){
                        nullCount++;
                    } else {
                        childList.add(treeNode.left);
                        integerList.add(treeNode.left.val);
                    }
                    if(treeNode.right == null){
                        nullCount++;
                    } else {
                        childList.add(treeNode.right);
                        integerList.add(treeNode.right.val);
                    }
                    if (i == rootList.size() - 1 && nullCount != size * 2){
                        tempList = rootList;
                        rootList = childList;
                        childList = tempList;
                        childList.clear();
                        break;
                    }
                }
                if(integerList.size() != 0){
                    list.add(integerList);
                }
                if (nullCount == size * 2){
                    return list;
                }
            }
        }
        return list;
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

```