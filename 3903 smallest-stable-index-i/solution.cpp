class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> mi(n,0);
        mi[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) mi[i] = min(mi[i+1],nums[i]);
        int ma = INT_MIN;
        for(int i=0;i<n;i++) {
            ma = max(ma,nums[i]);
            if(ma-mi[i] <= k) return i;
        }
        return -1; 
    }
};
