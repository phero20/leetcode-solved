public class Solution {
    public void MoveZeroes(int[] nums) {
        int l=0;
        for(int i=0;i<nums.Length;i++) {
            if(nums[i]!=0) {
                int temp = nums[l];
                nums[l++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
