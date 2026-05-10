public class Solution {
    public int[] RearrangeArray(int[] nums) {
        int[] ans = new int[nums.Length];
        int l = 0, r = 1;
        foreach(int i in nums) {
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
