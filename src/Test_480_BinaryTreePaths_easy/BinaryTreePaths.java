package Test_480_BinaryTreePaths_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/12.
 */
public class BinaryTreePaths {
    public static void main(String [] args){

    }
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        List<String> pathList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        if (root == null){
            return pathList;
        }
        builder.append(root.val + "");
        traversalPath(root, pathList, builder);
        return pathList;
    }
    public void traversalPath(TreeNode root, List<String> pathList, StringBuilder builder){
        if (root.left == null && root.right == null){
            pathList.add(builder.toString());
            return;
        }
        if (root.left != null){
            builder.append("->" + root.left.val);
            traversalPath(root.left, pathList, builder);
            builder.delete(builder.lastIndexOf("->"), builder.length());
        }
        if (root.right != null){
            builder.append("->" + root.right.val);
            traversalPath(root.right, pathList, builder);
            builder.delete(builder.lastIndexOf("->"), builder.length());
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