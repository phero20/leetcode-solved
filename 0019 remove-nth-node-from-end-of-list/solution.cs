/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode curr = dummy;
        ListNode prev = curr;
        int i=0;
        while(curr!=null) {
            if(i>n) prev=prev.next;
            curr=curr.next;
            i++;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
}
