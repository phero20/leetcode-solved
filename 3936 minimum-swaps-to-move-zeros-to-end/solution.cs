public class Solution {
    public int MinimumSwaps(int[] nums) {
        int l=0,r=nums.Length-1,ans=0;
        while(l<r) {
            if(nums[r]==0) {
                r--;
                l--;
            } else if(nums[l]==0) {
                r--;
                ans++;
            }
            l++;
        }
        return ans;
    }
}
