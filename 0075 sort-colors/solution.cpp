class Solution {
public:
    void sortColors(vector<int>& nums) {
        int z = 0, o = 0, t = nums.size()-1;
        while(o<=t) {
            if(nums[o]==0) {
                nums[o] = nums[z];
                nums[z] = 0;
                z++;
                o++;
            } else if(nums[o]==1) {
                o++;
            } else {
                nums[o] = nums[t];
                nums[t] = 2;
                t--;
            }
        }
    }
};
