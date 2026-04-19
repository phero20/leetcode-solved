class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int c1 = 0, cd1 = 0, c2 = 0, cd2 = 0;
        for(int i:nums) {
            if(cd1==i) c1++;
            else if(cd2==i) c2++;
            else if(c1==0) {
                cd1=i;
                c1++;
            } else if(c2==0) {
                cd2=i;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        vector<int> ans;
        c1 = 0, c2 = 0;
        for(int i:nums) {
            if(cd1 == i) c1++;
            else if(cd2 == i) c2++;
        }
        if(c1 > nums.size() /3) ans.push_back(cd1);
        if(c2 > nums.size() /3) ans.push_back(cd2);
        return ans;
    }
};
