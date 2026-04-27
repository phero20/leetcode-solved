class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<bool> s(1001,false);
        for(int i:nums1) s[i]=true;
        vector<int> ans;
        for(int i:nums2) {
            if(s[i]) {
                ans.push_back(i);
                s[i]=false;
            }
        }
        return ans;
    }
};
