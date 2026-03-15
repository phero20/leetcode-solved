public class ListNode {
    int key;
    int val;
    ListNode next, prev;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    private Map<Integer, ListNode> map;
    private ListNode front, rear;
    int size, capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        size = 0;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        ListNode curr = map.get(key);
        putFirst(curr);
        return curr.val;
    }

    public void put(int key, int value) {
        ListNode curr = null;
        if (map.containsKey(key)) {
            curr = map.get(key);
            curr.val = value;
            putFirst(curr);
        } else {
            if (capacity == size) {
                if(rear!=null) {
                map.remove(rear.key);
                rear = rear.prev;
                if (rear != null)
                    rear.next = null;
                else front=null;
                size--;
                }
            }
            curr = new ListNode(key, value);
            map.put(key, curr);
            if (front == null)
                front = rear = curr;
            else {
                curr.next = front;
                front.prev = curr;
                front = curr;
            }
            size++;
        }

    }

    public void putFirst(ListNode curr) {
        if (curr == front) return;
            if(curr.prev!=null)
                curr.prev.next = curr.next;
            if (curr.next != null)
                curr.next.prev = curr.prev;
            if(curr==rear) rear=curr.prev;
            curr.prev=null;
            curr.next = front;
            front.prev = curr;
            front = curr;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
