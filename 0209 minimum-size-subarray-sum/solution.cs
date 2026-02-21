public class Solution {
    public int MinSubArrayLen(int target, int[] nums) {
        int l=0,sum=0,m=int.MaxValue;
        for(int r=0;r<nums.Length;r++) {
            sum+=nums[r];
            while(sum>=target) {
                m=Math.Min(m,r-l+1);
                sum-=nums[l++];
            }
        }
        return m==int.MaxValue ? m=0 : m;
    }
}
