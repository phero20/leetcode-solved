public class Solution {
    public int[] SearchRange(int[] nums, int target) {
        int left = bin(nums,target,true);
        if(left==-1) return new[] {-1,-1};
        int right = bin(nums,target,false);
        return new[] {left,right};
    }
    private int bin(int[] nums,int target,bool isl) {
        int l = 0, r= nums.Length-1,res=-1;
        while(l<=r) {
            int mid =l+(r-l)/2;
            if(nums[mid] == target) {
                res=mid;
                if(isl) {
                    r=mid-1;
                } else {
                    l=mid+1;
                }
            } else if(nums[mid] < target) {
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        return res;
    }
}