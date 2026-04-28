class Solution {
public:
    int timeRequiredToBuy(vector<int>& ti, int k) {
        int t=0;
        for(int i=0;i<ti.size();i++) {
            if(i<=k) t+=min(ti[i],ti[k]);
            else t+=min(ti[i],ti[k]-1);
        }
        return t;
    }
};
