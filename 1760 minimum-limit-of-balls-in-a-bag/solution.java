class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1,r=0;
        for(int i:nums) r=Math.max(r,i);
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
    private boolean pos(int[] nums,int mid,int op) {
        int o = 0;
        for(int i:nums) {
            o+=(i-1)/mid;
            if(o>op) return false;
        }
        return true;
    }
}
