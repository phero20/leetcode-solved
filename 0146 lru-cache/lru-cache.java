class LRUCache {
    static class Node {
        int key,value;
        Node next,prev;
        Node(int key,int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    Node head,tail;
    Node[] map;
    int size,capacity;
    public LRUCache(int capacity) {
        map = new Node[100001];
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
        size = 0;
    }
    
    public int get(int key) {
        if(map[key]==null) return -1;
        Node node = map[key];
        moveFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map[key]!=null) {
            Node node = map[key];
            node.value = value;
            moveFront(node);
        } else {
            if(size>=capacity) {
                Node node = tail.prev;
                removeNode(node);
                map[node.key] = null;
            }
            Node node = new Node(key,value);
            addFirst(node);
            map[key]=node;
            size++;
        }
    }




    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    public void removeNode(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    public void moveFront(Node node) {
        removeNode(node);
        addFirst(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */