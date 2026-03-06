public class Solution {
    public int LongestConsecutive(int[] nums) {
        if(nums.Length==0) return 0;
        Array.Sort(nums);
        int st=1,c=0;
        for(int i=1;i<nums.Length;i++) {
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1) st++;
            else {
                c=Math.Max(c,st);
                st=1;
            }
        }
        return Math.Max(c,st);
    }
}
