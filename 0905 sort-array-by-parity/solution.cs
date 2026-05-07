public class Solution {
    public int[] SortArrayByParity(int[] nums) {
        int l =0;
        for(int i=0;i<nums.Length;i++) {
            if((nums[i] & 1)==0) {
                int temp = nums[i];
                nums[i]  = nums[l];
                nums[l++] = temp;
            }
        }
        return nums;
    }
}
