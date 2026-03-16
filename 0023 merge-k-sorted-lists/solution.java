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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode merge = new ListNode(0);
        ListNode curr = merge;

        for (ListNode l : lists)
            if (l != null)
                heap.add(l);

        while (!heap.isEmpty()) {
            ListNode smallest = heap.poll();
            curr.next = smallest;
            curr = curr.next;
            if (smallest.next != null)
                heap.add(smallest.next);
        }

        return merge.next;

    }
}
