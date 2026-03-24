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
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (true) {
           
            ListNode k1 = prev;
            for (int i = 0; i < k; i++) {
                k1 = k1.next;
                if (k1 == null) return dummy.next;
            }

           
            ListNode next = k1.next;

           
            ListNode prev1 = next;
            ListNode curr1 = prev.next;

            while (curr1 != next) {
                ListNode temp = curr1.next;
                curr1.next = prev1;
                prev1 = curr1;
                curr1 = temp;
            }

           
            ListNode temp = prev.next; 
            prev.next = k1;
            prev = temp;
        }
    }
}