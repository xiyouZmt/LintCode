package Test_096_PartitionList_easy;

/**
 * Created by zmt on 2017/7/22.
 */
public class PartitionList {
    public static void main(String [] args){

    }
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head == null){
            return null;
        }
        ListNode leftNode = new ListNode(0);
        ListNode rightNode = new ListNode(0);
        ListNode left = leftNode;
        ListNode right = rightNode;
        while(head != null){
            if(head.val < x){
                left.next = head;
                left = head;
            } else {
                right.next = head;
                right = head;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightNode.next;
        return leftNode.next;
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
