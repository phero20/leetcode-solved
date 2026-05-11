public class Solution {
    public int BagOfTokensScore(int[] tokens, int power) {
        Array.Sort(tokens);
        int l = 0, r = tokens.Length-1;
        int ans = 0,ma = 0;
        while( l<=r ) {
            if(power >= tokens[l]) {
                power-=tokens[l];
                l++;
                ans++;
                ma = Math.Max(ma, ans);
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
}
