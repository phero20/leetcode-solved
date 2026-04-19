class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        map[0]++;
        int curr = 0,ans = 0;
        for(int i:nums) {
            curr+=i;
            int need = curr - k;
            if(map.count(need)) ans+=map[need];
            map[curr]++;
        }
        return ans;
    }
};
