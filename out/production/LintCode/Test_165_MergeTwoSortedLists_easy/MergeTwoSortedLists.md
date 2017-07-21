## LintCode
### 165. <a href="http://www.lintcode.com/en/problem/merge-two-sorted-lists/"> Merge Two Sorted Lists (Easy) </a>

```java

package Test_165_MergeTwoSortedLists_easy;

/**
 * Created by zmt on 2017/7/20.
 */
public class MergeTwoSortedLists {
    public static void main(String [] args){

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode curr;
        ListNode head = null;
        ListNode pre = null;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                curr = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                curr = new ListNode(l1.val);
                l1 = l1.next;
            }
            if(head == null){
                pre = head = curr;
            }
            pre.next = curr;
            pre = curr;
        }
        while(l1 != null){
            curr = new ListNode(l1.val);
            l1 = l1.next;
            pre.next = curr;
            pre = curr;
        }
        while(l2 != null){
            curr = new ListNode(l2.val);
            l2 = l2.next;
            pre.next = curr;
            pre = curr;
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