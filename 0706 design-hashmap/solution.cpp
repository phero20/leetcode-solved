class Node {
public:
    int key, val;
    Node* next;
    Node(int k, int v) : key(k), val(v), next(nullptr) {}
};

class MyHashMap {
    std::vector<Node*> map;
    static const int SIZE = 100;
public:
    MyHashMap() {
        map.resize(SIZE, nullptr);
    }
    
    void put(int key, int value) {
        int idx = key % SIZE;
        Node* curr = map[idx];
        if(!curr) {
            map[idx] = new Node(key,value);
            return;
        }
        Node* prev = nullptr;
        while(curr) {
            if(curr->key==key) {
                curr->val = value;
                return;
            }
            prev = curr;
            curr=curr->next;
        }
        prev->next = new Node(key,value);
    }
    
    int get(int key) {
        int idx = key%SIZE;
        Node* curr = map[idx];
        while(curr) {
            if(curr->key==key) return curr->val;
            curr = curr->next;
        }
        return -1;
    }
    
    void remove(int key) {
        int idx = key%SIZE;
        Node* curr = map[idx];
        Node* prev = nullptr;
        while(curr) {
            if(curr->key==key) {
                if (prev) prev->next = curr->next;
                else map[idx] = curr->next;
                delete curr;
                return;
            }
            prev = curr;
            curr = curr->next;
        }
    }
};


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */
