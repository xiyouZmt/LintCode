package Test_035_ReverseLinkedList_easy;

/**
 * Created by zmt on 2017/6/24.
 */
public class ReverseLinkedList {
    public static void main(String [] args){

    }
    public ListNode reverse(ListNode head){
        ListNode node = head;
        ListNode nextNode;
        ListNode preNode = null;
        ListNode reverseNode = null;
        while (node != null){
            nextNode = node.next;
            if (nextNode == null){
                reverseNode = node;
            }
            node.next = preNode;
            preNode = node;
            node = nextNode;
        }
        return reverseNode;
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
