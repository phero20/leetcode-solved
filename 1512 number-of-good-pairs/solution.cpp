class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<int> map(101,0);
        for(int i:nums) map[i]++;
        int sum = 0;
        for(int i:map) {
            if(i>1) sum+=i*(i-1)/2;
        }
        return sum;
    }
};
