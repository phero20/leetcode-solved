class Solution {
public:
    int minimumSize(vector<int>& nums, int maxOperations) {
        int l=1,r=0;
        for(int i:nums) r=max(r,i);
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
    bool pos(vector<int> nums,int mid,int op) {
        int o = 0;
        for(int i:nums) {
            o+=(i-1)/mid;
            if(o>op) return false;
        }
        return true;
    }
};
