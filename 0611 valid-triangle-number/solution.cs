public class Solution {
    public int TriangleNumber(int[] nums) {
        Array.Sort(nums);
        int c=0;
        for(int i=nums.Length-1;i>1;i--) {
            c+=doIt(nums,i-1,i);
        }
        return c;
    }
    private int doIt(int[] nums,int l,int t) {
        int i=0,c=0;
        while(i<l) {
            int sum=nums[i]+nums[l];
            if(sum>nums[t]) {
                c+=l-i;
                l--;
            } else  i++;
        }
        return c;
    }
}
