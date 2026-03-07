public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.Length;i++) {
            if(nums[i]!=nums[j]) nums[++j]=nums[i];
        }
        return j+1;
    }
}
