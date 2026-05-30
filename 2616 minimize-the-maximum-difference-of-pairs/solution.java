class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0,r=nums[nums.length-1] - nums[0];
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
    private boolean pos(int[] nums,int mid ,int p) {
        int n = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]-nums[i-1] <= mid) {
                n++;
                i++;
            }
        }
        return n>=p;
    }
}
