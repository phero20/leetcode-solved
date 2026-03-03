/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode GetIntersectionNode(ListNode A, ListNode B) {
        // int l1=0,l2=0;
        // ListNode temp=A;
        // while(temp!=null) {
        //     temp=temp.next;
        //     l1++;
        // }
        // temp=B;
        // while(temp!=null) {
        //     temp=temp.next;
        //     l2++;
        // }
        // temp=A;
        // ListNode temp2 = B;
        // if(l1>l2) {
        //     for(int i=0;i<l1-l2;i++) temp=temp.next;
        // } else {
        //     for(int i=0;i<l2-l1;i++) temp2=temp2.next;
        // }
        // while(temp!=temp2) {
        //     temp=temp.next;
        //     temp2=temp2.next;
        // }
        // return temp;


        ListNode a = A;
        ListNode b = B;
        while(a!=b){
            a=a!=null ? a.next : B;
            b=b!=null ? b.next : A;
        }
        return a;
    }
}
