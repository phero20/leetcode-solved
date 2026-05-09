class Solution {
public:
    int numRescueBoats(vector<int>& p, int limit) {
        sort(p.begin(),p.end());
        int l = 0, r = p.size()-1, ans = 0;
        while(l<=r) {
            int sum = p[l]+p[r];
            if(sum <= limit) l++;
            r--;
            ans++;
        }
        return ans;
    }
};
