class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) map.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);
        for(List<Integer> list : map.values()) {
            if(list.size()>=3) {
                Collections.sort(list);
                for(int i=0;i+2<list.size();i++) {
                    int j = list.get(i);
                    int k = list.get(i+2);
                    int d = 2*(k-j);
                    ans = Math.min(ans,d);
                }
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}
