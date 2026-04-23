public class Solution {
    public bool Check(int[] nums) {
       int c =0;
       for(int i=1;i<nums.Length;i++) {
            if(nums[i-1] > nums[i]) c++;
            if(c > 1) return false;
       }
       if(nums[0] < nums[nums.Length-1]) c++;
       return c<=1;
    }
}
