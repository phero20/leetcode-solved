class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int c = 0,cd = 0;
        for(int i:nums) {
            if(c==0) {
                cd = i;
                c++;
            } else if(cd!=i) {
                c--;
            } else {
                c++;
            }
        }
        return cd;
    }
};
