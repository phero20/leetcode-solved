class MyHashSet {
    static class Node {
        int key;
        Node next;
        Node(int key) {
            this.key = key;
        }
    }
    int mod = 769;
    Node[] set;
    public int hash(int key) {
        return key%mod;
    }
    public MyHashSet() {
        set = new Node[mod];
    }
    
    public void add(int key) {
        int tkey = hash(key);
        Node temp = set[tkey];
        if(temp==null) {
            set[tkey] = new Node(key);
            return;
        }
        while(true) {
            if(temp.key==key) return;
            if(temp.next == null) break;
            temp = temp.next;
        }
        temp.next = new Node(key);
    }
    
    public void remove(int key) {
        int tkey = hash(key);
        Node temp = set[tkey];
        if(temp==null) return;
        if(temp.key==key) {
            set[tkey] = temp.next;
            return;
        }
        while(temp.next!=null) {
            if(temp.next.key == key) {
                temp.next = temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    
    public boolean contains(int key) {
        int tkey = hash(key);
        Node temp = set[tkey];
        while(temp!=null) {
            if(temp.key==key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */