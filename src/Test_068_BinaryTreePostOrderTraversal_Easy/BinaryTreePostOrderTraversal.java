package Test_068_BinaryTreePostOrderTraversal_Easy;

import java.util.ArrayList;

/**
 * Created by zmt on 2017/7/11.
 */
public class BinaryTreePostOrderTraversal {

    private ArrayList<Integer> list = new ArrayList<>();

    public static void main(String [] args){

    }

    public ArrayList<Integer> postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            list.add(root.val);
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