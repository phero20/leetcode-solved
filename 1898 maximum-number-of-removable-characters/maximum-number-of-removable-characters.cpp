class Solution {
public:
    int maximumRemovals(string s, string p, vector<int>& rem) {
       int l=0,r=rem.size(),ans = 0;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(pos(s,p,mid,rem)) {
                ans = mid;
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        return ans;
    }

    bool pos(string s, string p, int mid, vector<int> rem) {
        vector<bool> set(s.size(),false);
        for (int i = 0; i < mid; i++) {
            set[rem[i]] = true;
        }
        int l = 0;
        for (int i = 0; i < s.size(); i++) {
            if (set[i])
                continue;
            if (!set[i] && s[i] == p[l]) {
                l++;
            }
            if (l >= p.size())
                return true;
        }
        return l >= p.size();
    }
};