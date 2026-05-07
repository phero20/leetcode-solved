public class Solution {
    public int[] ApplyOperations(int[] nums) {
        int[] ans = new int[nums.Length];
        int idx = 0;
        for(int i=0;i<nums.Length-1;i++) {
            if(nums[i]==0) continue;
            if(nums[i]==nums[i+1]) {
                ans[idx++]=nums[i]*2;
                i++;
            } else {
                ans[idx++] = nums[i];
            }
        }
        if(nums[nums.Length-2] != nums[nums.Length-1])   
            ans[idx] = nums[nums.Length-1];
        return ans; 
    }
}
