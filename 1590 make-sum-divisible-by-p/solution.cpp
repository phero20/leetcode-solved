class Solution {
public:
    int minSubarray(vector<int>& nums, int p) {
        long total = 0;
        for(int i:nums) total+=i;
        int target = total%p;
        if(target==0) return 0;
        unordered_map<int,int> map;
        map[0] = -1;
        long pr = 0;
        int ans = nums.size();
        for(int i=0;i<nums.size();i++) {
            pr+=nums[i];
            int rem = pr%p;
            int need = (rem - target + p) % p;
            if(map.count(need)) {
                ans = min(ans,i-map[need]);
            }
            map[rem] = i;
        }
        return ans == nums.size() ? -1 : ans;
    }
};
