public class Solution {
    public int NumSubseq(int[] nums, int target) {
        Array.Sort(nums);
        int MOD = 1_000_000_007;
        int l = 0, r = nums.Length-1;
        long ans = 0;
        int[] pow = new int[nums.Length];
        pow[0]=1;
        for(int i=1;i<pow.Length;i++) {
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
