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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d=new ListNode(0);
        ListNode t=d;
        ListNode c1=list1;
        ListNode c2=list2;
        while(c1!=null &&c2!=null){
            if(c1.val>c2.val){
                t.next=c2;
                c2=c2.next;
            }else{
                t.next=c1;
                c1=c1.next;
            }
            t=t.next;
        }
        if(c1!=null){
            t.next=c1;
        }else{
            t.next=c2;
        }
return d.next;
    }
}