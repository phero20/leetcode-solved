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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        int[] res = new int[100000];
        ListNode p1=head;
        int i=0,l=0;
        while(p1!=null) {
            res[i++]=p1.val;
            p1=p1.next;
        }
        while(i>0) {
            if(res[l++]!=res[--i]) return false;
        }
        return true;
    }
}
