class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        boolean set[] = new boolean[nums.length];
        for(int i:nums) {
            if(set[i-1]) l.add(i);
            set[i-1] = true;
        }
        return l;
    }
}
