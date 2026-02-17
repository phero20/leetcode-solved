public class Solution {
    public int MinimumDifference(int[] nums, int k) {
        Array.Sort(nums);
        int mi=int.MaxValue;
        for(int i=0;i<=nums.Length-k;i++) {
            mi=Math.Min(mi,nums[i+k-1]-nums[i]);
        }
        return mi;
    }
}
