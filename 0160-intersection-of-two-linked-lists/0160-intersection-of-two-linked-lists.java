/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode A1 = headA;
        ListNode B1 = headB;

        while (A1 != B1) {

            if (A1 == null) {
                A1 = headB;
            } else {
                A1 = A1.next;
            }

            if (B1 == null) {
                B1 = headA;
            } else {
                B1 = B1.next;
            }
        }

        return A1;
    }
}