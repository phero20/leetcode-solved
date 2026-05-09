class Solution {
public:
    int numSubseq(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int mod = 1e9 + 7;
        vector<int> pow(nums.size(),1);
        for(int i=1;i<nums.size();i++) pow[i] = pow[i-1]*2 % mod;
        int l = 0, r = nums.size()-1;
        int ans = 0;
        while(l<=r) {
            int sum = nums[l]+nums[r];
            if(sum <= target) {
                ans = (ans + pow[r-l])%mod;
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
};
