class MyHashMap {
    private static class Node {
        int key, val;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private final int SIZE = 1000;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    public void put(int key, int value) {
        int idx = key%SIZE;
        if(buckets[idx]==null) {
            buckets[idx]=new Node(key,value);
            return;
        }
        Node curr = buckets[idx];
        Node prev = null;
        while(curr!=null) {
            if(curr.key==key) {
                curr.val=value;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        prev.next=new Node(key,value);
    }

    public int get(int key) {
        int idx = key % SIZE;
        Node temp = buckets[idx];
        while (temp != null) {
            if (temp.key == key)
                return temp.val;
            temp = temp.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = key % SIZE;
        Node temp = buckets[idx];
        Node prev = null;
        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) {
                    buckets[idx] = temp.next;
                    return;
                }
                else prev.next = temp.next;
                return;
            }
            prev = temp;
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
