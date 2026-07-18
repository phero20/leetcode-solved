class MyHashMap {

    static class Node {
        int key,value;
        Node next;
        Node(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }
    int mod = 769;
    Node[] map;
    public MyHashMap() {
        map = new Node[769];
    }
    public int hash(int key) {
        return key%mod;
    }
    public void put(int key, int value) {
        int tkey = hash(key);
        Node temp = map[tkey];
        if(temp==null) {
            map[tkey] = new Node(key,value);
            return;
        }
        while(true) {
            if(temp.key == key) {
                temp.value = value;
                return;
            }
            if(temp.next == null) break;
            temp = temp.next;
        }
        temp.next = new Node(key,value);    
    }
    
    public int get(int key) {
        int tkey = hash(key);
        Node temp = map[tkey];
        while(temp!=null) {
            if(temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int tkey = hash(key);
        Node temp = map[tkey];
        if(temp==null) return;
        if(temp.key==key) {
            map[tkey] = temp.next;
            return;
        }
        while(temp.next!=null) {
            if(temp.next.key == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }
}















/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */