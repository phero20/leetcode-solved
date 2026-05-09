class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        for(int i=1;i<nums.size()-1;i++) {
            if(2*nums[i] == nums[i-1] + nums[i+1]) {
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
                if(i>1) i-=2;
            }
        }
        return nums;
    }
};
