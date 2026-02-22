public class Solution {
    public int PivotIndex(int[] nums) {
        int sum=0,lsum=0;
        for(int i=0;i<nums.Length;i++) sum+=nums[i];
        for(int i=0;i<nums.Length;i++) {
            if(lsum==sum-nums[i]-lsum) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}
