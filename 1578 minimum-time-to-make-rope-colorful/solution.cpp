class Solution {
public:
    int minCost(string s, vector<int>& neededTime) {
        int l = 0;
        for(int i=1;i<neededTime.size();i++) {
            if(s[i]==s[i-1]) {
                l+=min(neededTime[i-1],neededTime[i]);
                neededTime[i] = max(neededTime[i],neededTime[i-1]);
            }
        }
        return l;
    }
};
