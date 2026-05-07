class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        vector<int> ans(nums.size(),0);
        int idx = 0;
        for(int i=0;i<nums.size()-1;i++) {
            if(nums[i]==0) continue;
            if(nums[i]==nums[i+1]) {
                ans[idx++]=nums[i]*2;
                i++;
            } else {
                ans[idx++] = nums[i];
            }
        }
        if(nums[nums.size()-2] != nums[nums.size()-1])   
            ans[idx] = nums[nums.size()-1];
        return ans; 
    }
};
