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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHead = rev(slow.next);
        slow.next=null;
        ListNode firstHead = head;
        while(firstHead!=null && secondHead!=null) {
            ListNode snext = secondHead.next;
            ListNode fnext = firstHead.next;
            firstHead.next = secondHead;
            secondHead.next = fnext;
            firstHead = fnext;
            secondHead = snext;
        }
    }
    public ListNode rev(ListNode head) {
        ListNode curr=head;
        ListNode prev = null;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
