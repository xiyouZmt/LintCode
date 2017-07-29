package Test_167_AddTwoNumbers_easy;

/**
 * Created by zmt on 2017/7/13.
 */
public class AddTwoNumbers {
    public static void main(String [] args){

    }
    public ListNode addListNode(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        } else if(l1 == null){
            return l2;
        } else if(l2 == null){
            return l1;
        } else {
            ListNode l1Node = l1;
            ListNode l2Node = l2;
            ListNode head = null;
            ListNode preNode = null;
            int result;
            int carry = 0;
            int count = 0;
            while (l1Node != null && l2Node != null){
                result = (l1Node.val + l2Node.val + carry) % 10;
                carry = (l1Node.val + l2Node.val + carry) / 10;
                ListNode node = new ListNode(result);
                if(count == 0){
                    head = preNode = node;
                } else {
                    preNode.next = node;
                    preNode = node;
                }
                l1Node = l1Node.next;
                l2Node = l2Node.next;
                count ++;
            }
            ListNode leftNode;
            if(l1Node == null){
                leftNode = l2Node;
            } else {
                leftNode = l1Node;
            }
            while (leftNode != null){
                result = (leftNode.val + carry) % 10;
                carry = (leftNode.val + carry) / 10;
                ListNode node = new ListNode(result);
                preNode.next = node;
                preNode = node;
                leftNode = leftNode.next;
            }
            if(carry != 0){
                preNode.next = new ListNode(carry);
            }
            return head;
        }
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