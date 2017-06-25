## LintCode
### 36. <a href="http://lintcode.com/problem/reverse-linked-list-ii"> Reverse          LinkedList (Medium) </a>

	package Test_036_ReverseLinkedList_medium;

	/**
	 * Created by zmt on 2017/6/24.
	 */
	public class ReverseLinkedList {
	    public static void main(String [] args){
	        
	    }
	
	    public ListNode reverseBetween(ListNode head, int m, int n){
	        if (m < 1 || m >= n){
	            return head;
	        }
	        ListNode mthNode = searchKthNode(head, m);
	        ListNode nthNode = searchKthNode(head, n);
	        ListNode reverseNode = null;
	        if (mthNode != null && nthNode != null){
	            ListNode preNode = null;
	            ListNode node = mthNode;
	            ListNode nextNode;
	
	            ListNode mthPreNode = mthPreNode(head, m);
	            ListNode nthNextNode = nthNode.next;
	
	            while (preNode != nthNode){
	                nextNode = node.next;
	                if (node == nthNode){
	                    reverseNode = node;
	                }
	                node.next = preNode;
	                preNode = node;
	                node = nextNode;
	            }
	            mthNode.next = nthNextNode;
	            if (mthPreNode != null){
	                mthPreNode.next = nthNode;
	                reverseNode = head;
	            }
	        }
	        return reverseNode;
	    }
	
	    public ListNode searchKthNode(ListNode head, int k){
	        ListNode kthNode = head;
	        int pos = 1;
	        if(pos == k){
	            return kthNode;
	        }
	        while (kthNode != null){
	            pos++;
	            kthNode = kthNode.next;
	            if(pos == k){
	                break;
	            }
	        }
	        return kthNode;
	    }
	
	    public ListNode mthPreNode(ListNode head, int m){
	        ListNode kthNode = head;
	        ListNode kthPreNode = null;
	        int pos = 1;
	        if(pos == m){
	            return null;
	        }
	        while (kthNode != null){
	            pos++;
	            kthPreNode = kthNode;
	            kthNode = kthPreNode.next;
	            if(pos == m){
	                break;
	            }
	        }
	        return kthPreNode;
	    }
	}
	
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}
