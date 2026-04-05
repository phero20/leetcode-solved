class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int idx = -1;
        for(int i=nums.length-1;i>=0;i--) {
            if(!set.add(nums[i])) {
                idx = i;
                break;
            }
        }
        return idx == -1 ? 0 : (idx + 3)/3;
    }
}
