/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prevGroup = dummy;

        while(true){

            ListNode kth = getKth(prevGroup, k);

            if(kth == null){
                break;
            }

            ListNode groupNext = kth.next;

            ListNode oldHead = prevGroup.next;

            ListNode newHead = reverse(oldHead, groupNext);

            prevGroup.next = newHead;

            prevGroup = oldHead;
        }

        return dummy.next;
    }

    public ListNode getKth(ListNode curr, int k){
        while(curr != null && k > 0){
            curr = curr.next;
            k--;
        }
        return curr;
    }

    public ListNode reverse(ListNode start, ListNode groupNext){
        ListNode prev = groupNext;
        ListNode curr = start;

        while(curr != groupNext){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}