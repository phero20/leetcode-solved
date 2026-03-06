class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer>[] b = new List[nums.length+1];
        for(int key:map.keySet()) {
            int val=map.get(key);
            if(b[val]==null) b[val]=new ArrayList<>();
            b[val].add(key);
        }
        int[] res = new int[k];
        int idx=0;
        for(int i=b.length-1;i>=0 && idx<k;i--) {
            if(b[i]!=null) {
                for(int num:b[i]) {
                    res[idx++]=num;
                    if(idx==k) break;
                }
            } 
        }
        return res;
    }
}
