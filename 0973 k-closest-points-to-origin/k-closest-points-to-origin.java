class Solution {

    static class Node {
        int[] cr;
        int dist;
        Node(int[] cr,int dist) {
            this.cr = cr;
            this.dist = dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.dist - b.dist);
        for(int[] cr:points) {
            int dist = cr[0] * cr[0] + cr[1] * cr[1];
            pq.add(new Node(cr,dist));
        }

        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++) {
            Node node = pq.poll();
            ans[i][0] = node.cr[0];
            ans[i][1] = node.cr[1];
        }
        return ans;
    }
}