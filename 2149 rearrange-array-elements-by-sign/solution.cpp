class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> ans(nums.size());
        int l = 0, r = 1;
        for(int i:nums) {
            if(i < 0) {
                ans[r] = i;
                r+=2;
            } else {
                ans[l] = i;
                l+=2;
            }
        }
        return ans;
    }
};
