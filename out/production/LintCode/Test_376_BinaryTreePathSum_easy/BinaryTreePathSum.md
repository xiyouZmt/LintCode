## LintCode
### 376. <a href="http://www.lintcode.com/en/problem/binary-tree-path-sum/"> Binary Tree Path Sum (Easy) </a>

```java

package Test_376_BinaryTreePathSum_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/12.
 */
public class BinaryTreePathSum {
    public static void main(String [] args){

    }

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        if(root == null){
            return null;
        }
        List<List<Integer>> pathList = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        traversalPath(root, pathList, path, root.val, target);
        return pathList;
    }

    public void traversalPath(TreeNode root, List<List<Integer>> pathList, List<Integer> path, int pathSum, int target){
        if(root.left == null && root.right == null){
            if(pathSum == target){
                pathList.add(new ArrayList<>(path));
                return;
            }
        }
        if(root.left != null){
            path.add(root.left.val);
            traversalPath(root.left, pathList, path, pathSum + root.left.val, target);
            path.remove(path.size() - 1);
        }
        if(root.right != null){
            path.add(root.right.val);
            traversalPath(root.right, pathList, path, root.right.val + pathSum, target);
            path.remove(path.size() - 1);
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