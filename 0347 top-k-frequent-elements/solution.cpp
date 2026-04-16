class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int, int> freq;
        for(int i:nums) freq[i]++;
        vector<vector<int>> bucket(n+1);
        for (auto &p : freq) bucket[p.second].push_back(p.first); 
        vector<int> ans;
        for(int i=n;i>=0;i--) {
            for(int num:bucket[i]) {
                ans.push_back(num);
                if (ans.size() == k) return ans;
            }
        }
        return ans;
    }
};
