public class Solution {
    public int MinimumSize(int[] nums, int maxOperations) {
        int l=1,r=0;
        foreach(int i in nums) r=Math.Max(r,i);
        while(l<r) {
            int mid = l+(r-l)/2;
            if(pos(nums,mid,maxOperations)) {
                r=mid;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    bool pos(int[] nums,int mid,int op) {
        int o = 0;
        foreach(int i in nums) {
            o+=(i-1)/mid;
            if(o>op) return false;
        }
        return true;
    }
}
