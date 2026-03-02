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
        ListNode pa = headA;
        ListNode pb = headB;
        // while(pa!=pb) {
        //     pa = pa!=null ? pa.next : headB;
        //     pb = pb!=null ? pb.next : headA;
        // }

        int lena=0,lenb=0;
        while(pa!=null) {
            pa=pa.next;
            lena++;
        }
        while(pb!=null) {
            pb=pb.next;
            lenb++;
        }
        pa=headA;
        pb=headB;
        if(lena>lenb) {
            for(int i=0;i<lena-lenb;i++) pa=pa.next;
        } else {
            for(int i=0;i<lenb-lena;i++) pb=pb.next;
        }
        while(pa!=pb) {
                pa=pa.next;
                pb=pb.next;
        }
        return pa;
    }
}
