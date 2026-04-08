class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        int[] count = new int[nums.length+1];
        for(int i:map.values()) {
            count[i]++;
        }
        for(int i:nums) {
            int freq = map.get(i);
            if(count[freq]==1) return i;
        }
        return -1;
    }
}
