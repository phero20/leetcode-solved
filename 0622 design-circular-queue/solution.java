public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyCircularQueue {
    private ListNode front, rear;
    int size,i;

    public MyCircularQueue(int k) {
        this.i = k;
        this.size=0;
    }

    public boolean enQueue(int value) {
        if (size == i)
            return false;
        ListNode newNode = new ListNode(value);
        if (front == null && rear == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            newNode.next = front;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 0)
            return false;
        if(size == 1)
            front = rear = null;
        else {
        rear.next = front.next;
        front = front.next;
        }
        size--;
        return true;
    }

    public int Front() {
        return size==0 ? -1 : front.val;
    }

    public int Rear() {
        return size==0 ? -1 : rear.val;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==i;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
