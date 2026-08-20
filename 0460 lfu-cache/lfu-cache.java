class LFUCache {
    Node[] map;
    DL[] frMap;
    int minFreq,size,capacity;
    public LFUCache(int capacity) {
        map = new Node[100001];
        frMap = new DL[100001];
        minFreq = 0;
        size = 0;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map[key]==null) return -1;
        Node node = map[key];
        int oldFreq = node.freq;
        node.freq++;
        frMap[oldFreq].removeNode(node);
        if(frMap[node.freq]==null) {
            frMap[node.freq] = new DL();
        }
        frMap[node.freq].addFirst(node);
        if(oldFreq == minFreq && frMap[oldFreq].isEmpty()) minFreq++;
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map[key]!=null) {
            Node node = map[key];
            node.val = value;
            int oldFreq = node.freq;
            node.freq++;
            frMap[oldFreq].removeNode(node);
            if(frMap[node.freq]==null) {
                frMap[node.freq] = new DL();
            }
            frMap[node.freq].addFirst(node);
            if(oldFreq == minFreq && frMap[oldFreq].isEmpty()) minFreq++;
        } else {
            if(size==capacity) {
                DL temp = frMap[minFreq];
                int tkey = temp.removeLast();
                map[tkey] = null;
                size--;
            }
            Node node = new Node(key,value);
            map[key] = node;
            if(frMap[1]==null) {
                frMap[1] = new DL();
            }
            frMap[1].addFirst(node);
            minFreq = 1;
            size++;
        }
    }
}

class Node {
    int key,val,freq;
    Node prev,next;
    Node(int key,int val) {
        this.key = key;
        this.val = val;
        prev = next = null;
        freq = 1;
    }      
}

class DL {

    Node head,tail;

    DL() {
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public void addFirst(Node node) {
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int removeLast() {
        Node node = tail.prev;
        removeNode(node);
        return node.key;
    }

    public boolean isEmpty() {
        return tail.prev == head;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */