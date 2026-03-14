/*
// Definition for a Node.
public class Node {
    public int val;
    public Node next;
    public Node random;
    
    public Node(int _val) {
        val = _val;
        next = null;
        random = null;
    }
}
*/

public class Solution {
    public Node CopyRandomList(Node head) {

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
