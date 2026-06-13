import java.util.Random;
class Solution {
    int[] nums;
    int max;
    Random rand;
    public Solution(int[] w) {
        rand = new Random();
        nums = new int[w.length];
        max=0;
        for(int i=0;i<w.length;i++) {
            max+=w[i];
            nums[i] = max;
        }
    }
    
    public int pickIndex() {
        int ra = rand.nextInt(max) + 1;
        int l=0,r=nums.length-1,ans=-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(nums[mid] >= ra) {
                ans=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */