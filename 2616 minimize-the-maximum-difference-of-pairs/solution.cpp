class Solution {
public:
    int minimizeMax(vector<int>& nums, int p) {
        sort(nums.begin(),nums.end());
        int l=0,r=nums[nums.size()-1] - nums[0];
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
    bool pos(vector<int> nums,int mid ,int p) {
        int n = 0;
        for(int i=1;i<nums.size();i++) {
            if(nums[i]-nums[i-1] <= mid) {
                n++;
                i++;
            }
        }
        return n>=p;   
    }
};
