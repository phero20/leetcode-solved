class LRUCache {

    static class Node {
        int key,value;
        Node next,prev;
        Node(int key, int value) {
            this.value = value;
            this.key = key;
            next = prev = null;
        }
    }
    Node head,tail;
    int size,capacity;
    Node[] map;
    public LRUCache(int capacity) {
        map = new Node[100001];
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        size = 0;
        this.capacity = capacity;
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
            if(size==capacity) {
                Node node = tail.prev;
                removeLast(node);
                map[node.key] = null;
                size--;
            }
            Node node = new Node(key,value);
            map[key] = node;
            addFirst(node);
            size++;
        }
    }


    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void removeLast(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void moveFront(Node node) {
        removeLast(node);
        addFirst(node);
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */