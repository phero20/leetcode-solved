public class Solution {
    public int[] LimitOccurrences(int[] nums, int k) {
        int l=0,c=0;
        for(int i=0;i<nums.Length;i++) {
            if(i==0 || nums[i]!=nums[i-1]) {
                c=1;
            } else {
                c++;
            }
            if(c<=k) {
                nums[l++] = nums[i];
            }
        }
        return nums.Take(l).ToArray();
    }
}
