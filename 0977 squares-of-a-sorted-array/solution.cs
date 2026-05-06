public class Solution {
    public int[] SortedSquares(int[] nums) {
        int[] ans = new int[nums.Length];
        int l=0,r=nums.Length-1;
        int idx=r;
        while(l<=r) {
            int p1 = nums[l]*nums[l];
            int p2 = nums[r]*nums[r];
            if(p1 > p2) {
                ans[idx] = p1;
                l++;
            } else {
                ans[idx] = p2;
                r--;
            }
            idx--;
        }   
        return ans;
    }
}
