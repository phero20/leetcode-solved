class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] st = new int[nums.length];
        int ans = 0, top = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[st[top]] > nums[i]) st[++top] = i;
        }
        for(int i=nums.length-1;i>=0;i--) {
            while(top>=0 && nums[st[top]] <= nums[i]) {
                ans = Math.max(i-st[top],ans);
                top--;
            }
        }
        return ans; 
    }
}
