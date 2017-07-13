package Test_067_BinaryTreeInorderTraversal_Easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/7/11.
 */
public class BinaryTreeInOrderTraversal {

    private ArrayList<Integer> list = new ArrayList<>();

    public static void main(String [] args){

    }

    public ArrayList<Integer> inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            list.add(root.val);
            inOrderTraversal(root.right);
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
