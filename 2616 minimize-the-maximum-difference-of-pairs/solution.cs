public class Solution {
    public int MinimizeMax(int[] nums, int p) {
        Array.Sort(nums);
        int l=0,r=nums[nums.Length-1] - nums[0];
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(pos(nums,mid,p)) {
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    private bool pos(int[] nums,int mid ,int p) {
        int n = 0;
        for(int i=1;i<nums.Length;i++) {
            if(nums[i]-nums[i-1] <= mid) {
                n++;
                i++;
            }
        }
        return n>=p; 
    }
}
