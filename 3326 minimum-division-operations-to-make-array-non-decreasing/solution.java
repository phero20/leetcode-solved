class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length,ans=0;
        for(int i=n-2;i>=0;i--) {
            while(nums[i+1] < nums[i]) {
                int r = gpd(nums[i]);
                if(r==1) return -1;
                nums[i]/=r;
                ans++;
            }
        }
        return ans;
    }
    private int gpd(int x) {
        if(x==1) return 1;
        for(int i=2;i*i<=x;i++) {
            if(x%i==0) {
                return x/i;
            }
        }
        return 1;
    }
}
