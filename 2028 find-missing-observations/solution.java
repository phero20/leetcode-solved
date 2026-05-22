class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = 0;
        for(int i:rolls) sum+=i;
        int an = mean*(m+n)-sum;
        if(an < n || an > n*6) return new int[0];
        int[] ans = new int[n];
        int b=an/n,r=an%n;
        for(int i=0;i<n;i++) {
            ans[i]=b+( i<r ? 1 : 0);
            if (ans[i] < 1 || ans[i] > 6) return new int[0];
        }
        return ans;
    }
}
