class Solution {
public:
    int maxWidthRamp(vector<int>& nums) {
        vector<int> st(nums.size());
        int ans = 0, top = 0;
        for(int i=1;i<nums.size();i++) {
            if(nums[st[top]] > nums[i]) st[++top] = i;
        }
        for(int i=nums.size()-1;i>=0;i--) {
            while(top>=0 && nums[st[top]] <= nums[i]) {
                ans = max(i-st[top],ans);
                top--;
            }
        }
        return ans; 
    }
};
