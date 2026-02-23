public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int[] res = new int[2*nums.Length];
        for(int i=0;i<nums.Length;i++) {
            res[i]=nums[i];
            res[i+nums.Length]=nums[i];
        }
        return res;
    }
}
