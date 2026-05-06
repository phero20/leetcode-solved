class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> ans(nums.size(),0);
        int l=0,r=nums.size()-1;
        int idx=r;
        while(l<=r) {
            int p1 = nums[l]*nums[l];
            int p2 = nums[r]*nums[r];
            if(p1 > p2) {
                ans[idx] = p1;
                l++;
            } else {
                ans[idx] = p2;
                r--;
            }
            idx--;
        }   
        return ans;
    }
};
