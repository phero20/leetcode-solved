class Trie {
    static class Node {
        Node[] arr;
        boolean eow;
        Node() {
            arr = new Node[128];
            eow = false;
        }
    }

    Node root;
    public Trie() {
        root = new Node();
    }
    
    public boolean help(String word,boolean insert,boolean search) {
        Node temp = root;
        for(char c:word.toCharArray()) {
            if(temp.arr[c]==null) {
                if(insert) {
                    temp.arr[c] = new Node();
                } else {
                    return false;
                }
            }
            temp = temp.arr[c];
        }
        temp.eow = insert ? true : temp.eow;
        return insert ? true : (search ? temp.eow : true);
    }
    public void insert(String word) {
        help(word,true,false);
    }
    
    public boolean search(String word) {
        return help(word,false,true);
    }
    
    public boolean startsWith(String word) {
        return help(word,false,false);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */