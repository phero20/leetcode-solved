class Solution {
public:
    bool divideArray(vector<int>& nums) {
        vector<int> f(600,0);
        for(int i:nums) f[i]++;
        for(int i:nums) {
            if((f[i] & 1) == 1) return false;
        }
        return true; 
    }
};
