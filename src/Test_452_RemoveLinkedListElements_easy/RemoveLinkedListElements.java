package Test_452_RemoveLinkedListElements_easy;

/**
 * Created by zmt on 2017/7/29.
 */
public class RemoveLinkedListElements {
    public static void main(String [] args){

    }
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode preNode = null;
        ListNode node = head;
        while(node != null){
            if(node.val == val){
                if(preNode != null){
                    preNode.next = node.next;
                } else {
                    head = node.next;
                }
            } else {
                preNode = node;
            }
            node = node.next;
        }
        return head;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
