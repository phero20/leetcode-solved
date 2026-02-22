public class Solution {
    public int FindMiddleIndex(int[] nums) {
        int sum=0;
        foreach(int i in nums) sum+=i;
        int lsum=0;
        for(int i=0;i<nums.Length;i++) {
            if(lsum==sum-nums[i]-lsum) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}
