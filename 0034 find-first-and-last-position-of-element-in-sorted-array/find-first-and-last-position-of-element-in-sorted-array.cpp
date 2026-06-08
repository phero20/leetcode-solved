class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int left = bin(nums,target,true);
        if(left==-1) return {-1,-1};
        int right = bin(nums,target,false);
        return {left,right};
    }
    int bin(vector<int> nums,int target,bool le) {
        int l=0,r=nums.size()-1,ans = -1;
        while(l<=r) {
            int mid = l+(r-l)/2;        
            if(nums[mid]==target) {
                ans = mid;
                if(le) r=mid-1;
                else l=mid+1;
            } else if(nums[mid] < target) {
                l=mid+1; 
            } else {
                r=mid-1;
            }
        }
        return ans;
    }
};