## LintCode
### 7. <a href="http://lintcode.com/problem/binary-tree-serialization"> SerializeAndDeserialize (Medium) </a>

	package Test_007_SerializeAndDeserialize_medium;

	import java.util.ArrayList;
	import java.util.List;
	
	/**
	 * Created by zmt on 2017/6/22.
	 */
	public class SerializeAndDeserialize {
	    public static void main(String [] args){
	        System.out.println(serialize(deserialize("{1,2,3,11,#,4,5,#,#,6,7,#,10,#,#,8,9,#,#,12,13,#,#,#,#,#,14}")));
	    }
	
	    public static String serialize(TreeNode root){
	        // write your code here
	        if(root != null){
	            List<TreeNode> rootList = new ArrayList<>();
	            rootList.add(root);
	            StringBuilder builder = new StringBuilder();
	            builder.append("{").append(root.value).append(",");
	            List<TreeNode> childList = new ArrayList<>();
	            List<TreeNode> tempList;
	            while (true){
	                int nullCount = 0, size = rootList.size();
	                for(int i = 0; i < size; i++){
	                    TreeNode treeNode = rootList.get(i);
	                    if(treeNode.left == null){
	                        nullCount++;
	                        builder.append("#,");
	                    } else {
	                        childList.add(treeNode.left);
	                        builder.append(treeNode.left.value).append(",");
	                    }
	                    if(treeNode.right == null){
	                        nullCount++;
	                        builder.append("#,");
	                    } else {
	                        childList.add(treeNode.right);
	                        builder.append(treeNode.right.value).append(",");
	                    }
	                    if (i == rootList.size() - 1 && nullCount != size * 2){
	                        tempList = rootList;
	                        rootList = childList;
	                        childList = tempList;
	                        childList.clear();
	                        break;
	                    }
	                }
	                if (nullCount == size * 2){
	                    int length = builder.length();
	                    int i;
	                    for(i = length - 1; i >= 0; i--){
	                        if (builder.charAt(i) != '#' && builder.charAt(i) != ','){
	                            break;
	                        }
	                    }
	                    builder.replace(i + 1, length, "}");
	                    return builder.toString();
	                }
	            }
	        }
	        return null;
	    }
	
	    public static TreeNode deserialize(String data){
	        if(data == null){
	            return null;
	        }
	        String [] values = data.substring(1, data.length() - 1).split(",");
	        boolean isLeftChild = true;
	        int index = 0;
	        ArrayList<TreeNode> treeNodes = new ArrayList<>();
	        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
	        treeNodes.add(root);
	        for (int i = 1; i < values.length; i++) {
	            if (!values[i].equals("#")) {
	                TreeNode treeNode = new TreeNode(Integer.parseInt(values[i]));
	                if (isLeftChild) {
	                    treeNodes.get(index).left = treeNode;
	                } else {
	                    treeNodes.get(index).right = treeNode;
	                }
	                treeNodes.add(treeNode);
	            }
	            if (!isLeftChild) {
	                index++;
	            }
	            isLeftChild = !isLeftChild;
	        }
	        return root;
	    }
	}
	
	class TreeNode {
	    public int value;
	    public TreeNode left, right;
	    public TreeNode(int val) {
	        this.value = val;
	        this.left = this.right = null;
	    }
	
	    @Override
	    public String toString() {
	        return super.toString();
	    }
	}
