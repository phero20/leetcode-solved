class Solution {
    static class Node {
        int fr;
        char c;
        Node(int fr,char c) {
            this.fr = fr;
            this.c = c;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> y.fr - x.fr);
        if(a > 0) pq.add(new Node(a,'a'));
        if(b > 0) pq.add(new Node(b,'b'));
        if(c > 0) pq.add(new Node(c,'c'));
        StringBuilder sb = new StringBuilder();
        Node prev = null;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int len = sb.length();
            if(len >= 2 && sb.charAt(len-1)==node.c && sb.charAt(len-2)==node.c) {
                if (pq.isEmpty()) break;
                Node nxt = pq.poll();
                nxt.fr--;
                sb.append(nxt.c);
                if(nxt.fr > 0) pq.add(nxt);
                pq.add(node);
            } else {
                int u = Math.min(2,node.fr);
                for(int i=0;i<u;i++) {
                    sb.append(node.c);
                }
                node.fr-=u;
                if(node.fr > 0) pq.add(node);
            }
        }
        return sb.toString();
    }
}