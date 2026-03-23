public class MyHashMap
{
    private class Node
    {
        public int key, val;
        public Node next;
        public Node(int key, int val)
        {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    private Node[] map;
    private int size = 1000;

    public MyHashMap()
    {
        map = new Node[size];
    }

    public void Put(int key, int value)
    {
        int index = key % size;
        if (map[index] == null)
        {
            map[index] = new Node(key, value);
            return;
        }
        Node curr = map[index];
        Node prev = null;
        while (curr != null)
        {
            if (curr.key == key)
            {
                curr.val = value; // update existing
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = new Node(key, value); // add new node
    }

    public int Get(int key)
    {
        int index = key % size;
        Node curr = map[index];
        while (curr != null)
        {
            if (curr.key == key) return curr.val;
            curr = curr.next;
        }
        return -1; // not found
    }

    public void Remove(int key)
    {
        int index = key % size;
        Node curr = map[index];
        Node prev = null;
        while (curr != null)
        {
            if (curr.key == key)
            {
                if (prev == null)
                {
                    map[index] = curr.next; // remove head
                }
                else
                {
                    prev.next = curr.next; // bypass node
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
