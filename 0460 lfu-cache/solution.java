class LFUCache {

    Map<Integer, Node> keyMap;
    Map<Integer, DoublyLinkedList> freqMap;
    int minFreq, capacity;

    public LFUCache(int capacity) {
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
        minFreq = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            int oldFreq = node.freq;
            freqMap.get(oldFreq).remove(node);
            if(minFreq==oldFreq && freqMap.get(oldFreq).isEmpty()) minFreq++;
            node.freq++;
            freqMap.putIfAbsent(node.freq,new DoublyLinkedList());
            freqMap.get(node.freq).addFirst(node);
            return node.value;
        } else return -1;
    }

    public void put(int key, int value) {
            if (capacity == 0)
                return;

            if (keyMap.containsKey(key)) {
                Node node = keyMap.get(key);
                node.value=value;
                int oldFreq = node.freq;
                freqMap.get(oldFreq).remove(node);
                if(minFreq==oldFreq && freqMap.get(oldFreq).isEmpty()) minFreq++;
                node.freq++;
                freqMap.putIfAbsent(node.freq,new DoublyLinkedList());
                freqMap.get(node.freq).addFirst(node);
                return;
            } 
            if (keyMap.size() == capacity) {
                DoublyLinkedList list = freqMap.get(minFreq);
                Node node = list.removeLast();
                keyMap.remove(node.key);
            }
            Node node = new Node(key,value);
            node.freq=1;
            freqMap.putIfAbsent(1,new DoublyLinkedList());
            freqMap.get(1).addFirst(node);
            keyMap.put(key,node);
            minFreq=1;
    }
}

public class Node {
    int key;
    int value;
    int freq;
    Node prev, next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.freq = 0;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head, tail;
    int size;

    DoublyLinkedList() {
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
        size++;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public Node removeLast() {
        if (size == 0)
            return null;
        Node prev = tail.prev;
        remove(prev);
        return prev;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
