class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        bool isd = true,isi = true;
        for(int i=1;i<nums.size();i++) {
            if(nums[i] < nums[i-1]) isi=false;
            if(nums[i] > nums[i-1]) isd = false;
        }
        return isd || isi;
    }
};
