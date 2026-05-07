class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int l = 0;
        for(int i=0;i<nums.size();i++) {
            if((nums[i] & 1) == 0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l++] = temp;
            }
        }
        return nums;
    }
};
