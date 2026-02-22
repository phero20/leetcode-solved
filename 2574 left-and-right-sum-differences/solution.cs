public class Solution {
    public int[] LeftRightDifference(int[] nums) {
        int n=nums.Length;
        int lsum=0,rsum=0;
        foreach(int i in nums) lsum+=i;
        for(int i=0;i<n;i++) {
            int l=nums[i];
            rsum+=l;
            nums[i]=Math.Abs(lsum-rsum);
            lsum-=l;
        }
        return nums;
    }
}
