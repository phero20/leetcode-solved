public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] pr = new int[nums.Length];
        pr[0] = 1;
        for(int i=1;i<nums.Length;i++) {
            pr[i] = pr[i-1]*nums[i-1];
        }
        int s = 1;
        for(int i = pr.Length-1;i>=0;i--) {
            pr[i]*=s;
            s*=nums[i];
        }
        return pr;
    }
}
