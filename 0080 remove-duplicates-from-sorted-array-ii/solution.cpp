class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int c = 1,wr=1;
        for(int i=1;i<nums.size();i++) {
            if(nums[i]==nums[i-1]) c++;
            else c=1;
            if(c<=2) {
                nums[wr++] = nums[i];
            }
        }
        return wr;
    }
};
