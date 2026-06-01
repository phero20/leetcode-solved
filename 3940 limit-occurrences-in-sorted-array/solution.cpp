class Solution {
public:
    vector<int> limitOccurrences(vector<int>& nums, int k) {
        int l=0,c=0;
        for(int i=0;i<nums.size();i++) {
            if(i==0 || nums[i]!=nums[i-1]) {
                c=1;
            } else {
                c++;
            }
            if(c<=k) {
                nums[l++] = nums[i];
            }
        }
        return vector<int>(nums.begin(),nums.begin()+l);
    }
};
