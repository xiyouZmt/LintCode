## LintCode
### 372. <a href="http://www.lintcode.com/en/problem/delete-node-in-the-middle-of-singly-linked-list/"> Delete Node in the Middle of Singly Linked List (Easy) </a>

```java

package Test_372_DeleteNode_easy;

/**
 * Created by zmt on 2017/7/15.
 */
public class DeleteNode {
    public static void main(String [] args){

    }
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null){
            return;
        }
        ListNode next = node.next;
        if (next != null){      //node不是最后一个节点
            node.val = next.val;
            node.next = next.next;
        } else {                //node是最后一个节点
            node = null;
        }
    }
}

/**
 * Definition of TreeNode:
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

```