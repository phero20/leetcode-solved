public class Solution {
    public int[] Shuffle(int[] nums, int n) {
         int[] res=new int[nums.Length];
        for(int i=0;i<n;i++) {
           res[2*i]=nums[i];
           res[2*i+1]=nums[i+n];
        }
        return res;
    }
}
