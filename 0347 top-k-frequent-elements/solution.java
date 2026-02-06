class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.merge(i,1,Integer::sum);
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((e1,e2)->e2.getValue()-e1.getValue());
        maxHeap.addAll(map.entrySet());
        int res[] = new int[k];
        int j=0;
        while(j<k) {
            Map.Entry<Integer,Integer> entry = maxHeap.poll();
            res[j++]=entry.getKey();
        }
        return res;
    }
}
