class Solution {
    static final int MOD = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;
        long ans = 0;
        int[] pow = new int[nums.length];
        pow[0]=1;
        for(int i=1;i<pow.length;i++) {
            pow[i] = (pow[i-1]*2) % MOD;
        }
        while(l<=r) {
            int sum  = nums[l]+nums[r];
            if(sum <= target) {
                ans = (ans + pow[r - l]) % MOD;
                l++;
            } else {
                r--;
            }
        }
        return (int)ans;
    }
}
