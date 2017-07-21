## LintCode
### 166. <a href="http://lintcode.com/en/problem/nth-to-last-node-in-list/"> Nth to Last Node in List (Easy) </a>

```java

package Test_166_NthToLastNodeInList_easy;

/**
 * Created by zmt on 2017/7/21.
 */
public class NthToLastNodeInList {
    public static void main(String [] args){

    }
    private ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if(head != null){
            int count = 0;
            ListNode result = head;
            ListNode nthNode = head;
            while(count < n){
                nthNode = nthNode.next;
                if(nthNode == null && count < n - 1){
                    return nthNode;
                }
                count++;
            }
            while(nthNode != null){
                nthNode = nthNode.next;
                result = result.next;
            }
            return result;
        }
        return null;
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