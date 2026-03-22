class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->(a[0] + a[1]) - (b[0] + b[1]));
        for(int i=0;i<Math.min(k,nums1.length);i++) {
           minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }
        List<List<Integer>> ans = new ArrayList<>();
        while(!minHeap.isEmpty() && ans.size()<k) {
            int[] curr = minHeap.poll();
            List<Integer> in = new ArrayList<>();
            in.add(curr[0]);
            in.add(curr[1]);
            ans.add(in);
            if (curr[2] + 1 < nums2.length) {
                minHeap.offer(new int[]{curr[0], nums2[curr[2] + 1], curr[2] + 1});
            }
        }
        return ans;
    }
}
