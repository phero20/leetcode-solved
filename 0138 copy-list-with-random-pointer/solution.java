/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        while (curr != null) {
            Node neww = new Node(curr.val);
            neww.next = curr.next;
            curr.next = neww;
            curr = neww.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) 
                curr.next.random = curr.random.next;
            curr=curr.next.next;
        }
        curr = head;
        Node newHead = new Node(0);
        Node n = newHead;
        while (curr != null) {
            n.next = curr.next;
            n = n.next;
            curr.next = curr.next.next;
            curr = curr.next;
        }
        return newHead.next;
    }
}
