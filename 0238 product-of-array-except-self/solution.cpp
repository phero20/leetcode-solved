class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
       vector<int> ans(nums.size(),1);
        ans[0] = 1;
        for(int i=1;i<nums.size();i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int suff = 1;
        for(int n = ans.size() - 1 ; n>=0; n--) {
            ans[n] *= suff;
            suff*=nums[n];
        }
        return ans;
    }
};
