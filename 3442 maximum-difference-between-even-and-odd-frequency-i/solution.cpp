class Solution {
public:
    int maxDifference(string s) {
        vector<int> f(26);
        for(char c : s) {
            f[c-'a']++;
        }
        int minE = 101,maxO = -1;
        for(int i : f) {
            if(i==0) continue;
            if((i & 1) ==0) {
                minE = min(minE,i);
            } else if(i > maxO) {
                maxO = i;
            }
        }
        return maxO - minE;
    }
};
