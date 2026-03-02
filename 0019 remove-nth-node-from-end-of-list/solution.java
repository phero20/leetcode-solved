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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode dummy = new ListNode(0,head);
        ListNode temp = dummy;
        ListNode prev=dummy;
        while(temp!=null) {
            if(i>n) prev=prev.next;
            temp=temp.next;
            i++;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
}
