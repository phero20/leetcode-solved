class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<bool> arr(nums.size(),false);

        for(int i:nums) {
            arr[i-1] = true;
        }
        vector<int> ans;
        for(int i=1;i<=nums.size();i++) {
            if(!arr[i-1]) ans.push_back(i);
        }
        return ans;
    }
};
