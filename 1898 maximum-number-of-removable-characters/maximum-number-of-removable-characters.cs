public class Solution {
    public int MaximumRemovals(string s, string p, int[] rem) {
        int l=0,r=rem.Length,ans = 0;
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

    private bool pos(String s, String p, int mid, int[] rem) {
        bool[] set = new bool[s.Length];
        for (int i = 0; i < mid; i++) {
            set[rem[i]] = true;
        }
        int l = 0;
        for (int i = 0; i < s.Length; i++) {
            if (set[i])
                continue;
            if (!set[i] && s[i] == p[l]) {
                l++;
            }
            if (l >= p.Length)
                return true;
        }
        return l >= p.Length;
    }
}