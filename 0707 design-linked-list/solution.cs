
public class Node{
    public int val;
    public Node next;

    public Node(int val = 0, Node next = null) {
        this.val = val;
        this.next = next;
    }
}

public class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList() {
        head = new Node(0);
        size=0;
    }
    
    public int Get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for(int i=0;i<=index;i++) {
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void AddAtHead(int val) {
        AddAtIndex(0, val);
    }
    
    public void AddAtTail(int val) {
        AddAtIndex(size, val);
    }
    
    public void AddAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        Node temp = head;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    
    public void DeleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node temp = head;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.Get(index);
 * obj.AddAtHead(val);
 * obj.AddAtTail(val);
 * obj.AddAtIndex(index,val);
 * obj.DeleteAtIndex(index);
 */
