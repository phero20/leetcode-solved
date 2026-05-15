public class Solution {
    public int MaxWidthRamp(int[] nums) {
        int[] st = new int[nums.Length];
        int ans = 0, top = 0;
        for(int i=1;i<nums.Length;i++) {
            if(nums[st[top]] > nums[i]) st[++top] = i;
        }
        for(int i=nums.Length-1;i>=0;i--) {
            while(top>=0 && nums[st[top]] <= nums[i]) {
                ans = Math.Max(i-st[top],ans);
                top--;
            }
        }
        return ans; 
    }
}
