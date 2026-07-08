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
    public int pairSum(ListNode head) {
        
        int max = 0;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        ListNode p1 = head;
        ListNode p2 = slow.next;

        while(p2 != null){
            int sum = 0;
            sum=p1.val+p2.val;
            p1 = p1.next;
            p2 = p2.next;
            max = Math.max(max, sum);
        }
        return max;
    }

    public ListNode reverse(ListNode head){

        ListNode curr = head;
        ListNode before = null;
        ListNode after = null;

        while(curr != null){

            after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;

            
        }
        return before;
    }
}