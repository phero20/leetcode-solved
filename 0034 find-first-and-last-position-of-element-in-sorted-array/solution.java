class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = bin(nums, target, true);
        if (left == -1) return new int[] { -1, -1 }; 
        int right = bin(nums, target, false);
        return new int[] { left, right }; 
    }
    private int bin(int[] nums,int target,boolean isLeft) {
        int low=0,high=nums.length-1;
        int bound=-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(nums[mid]==target) {
                bound=mid;
                if(isLeft) high=mid-1;
                else low=mid+1;
            } else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return bound;
    }
}
