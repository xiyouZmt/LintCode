package Test_173_InsertionSortList_easy;

/**
 * Created by zmt on 2017/7/17.
 */
public class InsertionSortList {
    public static void main(String [] args){

    }
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode next = head.next;
        ListNode k  = null;
        if(next == null){
            return head;
        }
        int temp = 0;;
        while(current.next != null){
            k = current;
            while(next != null){
                if(k.val > next.val){
                    k = next;
                }
                next = next.next;
            }
            if(k.val != current.val){
                temp = current.val;
                current.val = k.val;
                k.val = temp;
            }
            current = current.next;
            next = current.next;
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
