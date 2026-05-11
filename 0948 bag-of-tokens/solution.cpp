class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(),tokens.end());
        int l = 0, r = tokens.size()-1;
        int ans = 0,ma = 0;
        while( l<=r ) {
            if(power >= tokens[l]) {
                power-=tokens[l];
                l++;
                ans++;
                ma = max(ma, ans);
            } else if(ans > 0) {
                power+=tokens[r];
                r--;
                ans--;
            } else {
                break;
            }
        }
        return ma;
    }
};
