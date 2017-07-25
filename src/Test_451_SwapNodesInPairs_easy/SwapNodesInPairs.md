## LintCode
### 451. <a href="http://www.lintcode.com/en/problem/swap-nodes-in-pairs/"> Swap Nodes in Pairs (Easy) </a>

```java

package Test_451_SwapNodesInPairs_easy;

/**
 * Created by zmt on 2017/7/25.
 */
public class SwapNodesInPairs {
    public static void main(String [] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        swapPairs(head);
    }

    public static ListNode swapPairs(ListNode head) {
        // Write your code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode curr = head.next;
        ListNode temp = null;
        ListNode result = head.next;
        while(true){
            pre.next = curr.next;
            curr.next = pre;
            if(temp != null){
                temp.next = curr;
            }
            temp = pre;
            if(pre.next == null){
                return result;
            }
            curr = pre.next;
            if(curr.next == null){
                return result;
            }
            curr = curr.next;
            pre = pre.next;
        }
    }
}

/**
 * Definition for ListNode.
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