public class Solution {
    public int[] MissingRolls(int[] rolls, int mean, int n) {
        int m = rolls.Length;
        int sum = 0;
        foreach(int i in rolls) sum+=i;
        int an = mean*(m+n)-sum;
        if(an < n || an > n*6) return Array.Empty<int>();
        int[] ans = new int[n];
        int b=an/n,r=an%n;
        for(int i=0;i<n;i++) {
            ans[i]=b+( i<r ? 1 : 0);
            if (ans[i] < 1 || ans[i] > 6) return Array.Empty<int>();
        }
        return ans;
    }
}
