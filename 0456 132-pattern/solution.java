class Solution {
    public boolean find132pattern(int[] nums) {
        int[] st = new int[nums.length];
        int top = -1,m=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] < m){
                return true;
            }
            while(top!=-1 && st[top] < nums[i]) {
                m = st[top--]; 
            }
            st[++top] = nums[i];
        }
        return false;
    }
}
