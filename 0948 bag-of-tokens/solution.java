class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0, r = tokens.length-1;
        int ans = 0,ma = 0;
        while( l<=r ) {
            if(power >= tokens[l]) {
                power-=tokens[l];
                l++;
                ans++;
                ma = Math.max(ma, ans);
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
