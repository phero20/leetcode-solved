public class Solution {
    public int LongestOnes(int[] nums, int k) {
        int l=0,m=0;
        for(int r=0;r<nums.Length;r++) {
            if(nums[r]==0) k--;
            while(k<0) {
                if(nums[l]==0) k++;
                l++;
            }
            m=Math.Max(m,r-l+1);
        }
        return m;
    }
}
