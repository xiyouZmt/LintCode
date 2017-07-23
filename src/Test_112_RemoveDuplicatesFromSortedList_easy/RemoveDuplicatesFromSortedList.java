package Test_112_RemoveDuplicatesFromSortedList_easy;

/**
 * Created by zmt on 2017/7/23.
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String [] args){

    }

    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null){
            return null;
        }
        ListNode result = new ListNode(head.val);
        ListNode point = result;
        ListNode pre = head;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val != pre.val){
                pre = curr;
                point.next = curr;
                point = curr;
            }
            curr = curr.next;
        }
        point.next = null;
        return result;
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
