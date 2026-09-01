class Solution {
    int ans;
    public int subsetXORSum(int[] nums) {
        ans = 0;
        bt(nums,0,0);
        return ans;
    }

    private void bt(int[] nums,int i,int xor) {
        if(i==nums.length) {
            ans+=xor;
            return;
        }
        bt(nums,i+1,nums[i]^xor);
        bt(nums,i+1,xor);
    }
}