## LintCode
### 174. <a href="http://www.lintcode.com/en/problem/remove-nth-node-from-end-of-list/"> Remove Nth Node From End of List (Easy) </a>

```java

package Test_174_RemoveNthNodeFromEndOfList_easy;

/**
 * Created by zmt on 2017/7/23.
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String [] args){

    }
    private ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if(head == null){
            return null;
        }
        int count = 0;
        ListNode nthNode = head;
        ListNode result = head;
        while(count < n){
            nthNode = nthNode.next;
            if(nthNode == null && count < n-1){
                return null;
            }
            count ++;
        }
        ListNode pre = null;
        while(nthNode != null){
            nthNode = nthNode.next;
            pre = result;
            result = result.next;
        }
        if(result == head){
            return head.next;
        }
        if(result.next == null){
            pre.next = null;
        } else {
            result.val = result.next.val;
            result.next = result.next.next;
        }
        return head;
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