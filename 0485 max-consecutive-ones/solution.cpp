class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int ans = -1, st = 0;
        for(int i=0;i<nums.size();i++) {
            if(nums[i] == 1) {
                st++;
            } else {
                ans = max(ans,st);
                st=0;
            }
        }
        return max(ans,st);
    }
};
