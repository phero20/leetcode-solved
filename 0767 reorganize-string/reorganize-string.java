class Solution {
    static class Node {
        int fr;
        char c;
        Node(int fr,char c) {
            this.fr = fr;
            this.c = c;
        }
    }
    public String reorganizeString(String s) {
        int[] map = new int[26];
        for(char c : s.toCharArray()) {
            map[c-'a']++;
            if(map[c-'a'] > (s.length()+1) / 2) return "";
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> b.fr - a.fr);
        for(int i=0;i<26;i++) {
            if(map[i] > 0) {
                char c = (char)('a'+i);
                pq.add(new Node(map[i],c));
            }
        }
        StringBuilder sb = new StringBuilder();
        Node prev = null;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            sb.append(node.c);
            node.fr--;
            if(prev!=null && prev.fr > 0) {
                pq.add(prev);
            }
            prev = node;
        }
        return sb.toString();
    }
}