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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode temp = head;

        while(temp.next != null){
            length++;
            temp = temp.next;
        }

        ListNode first = head;
        k = k % length;

        if(k == 0){
            return head;
        }

        for(int i = 0; i < k; i++){
            first = first.next;
        }

        ListNode second = head;

        while(first.next != null){
            first = first.next;
            second = second.next;
        }

        ListNode newHead = second.next;
        second.next = null;
        first.next = head;

        return newHead;

    }
}