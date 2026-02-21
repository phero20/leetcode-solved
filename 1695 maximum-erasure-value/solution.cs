public class Solution {
    public int MaximumUniqueSubarray(int[] nums) {
        bool[] set = new bool[100007];
        int l=0,sum=0,m=0;
        for(int r=0;r<nums.Length;r++) {
            while(set[nums[r]]) {
                sum-=nums[l];
                set[nums[l]]=false;
                l++;
            }
            sum+=nums[r];
            set[nums[r]]=true;
            m=Math.Max(m,sum);
        }
        return m;
    }
}
