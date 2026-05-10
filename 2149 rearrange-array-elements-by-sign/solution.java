class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0, r = 1;
        for(int i:nums) {
            if(i < 0) {
                ans[r] = i;
                r+=2;
            } else {
                ans[l] = i;
                l+=2;
            }
        }
        return ans;
    }
}
