class Solution {
    public int maximumRemovals(String s, String p, int[] rem) {
        int l=0,r=rem.length,ans = 0;
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

    private boolean pos(String s, String p, int mid, int[] rem) {
        boolean[] set = new boolean[s.length()];
        for (int i = 0; i < mid; i++) {
            set[rem[i]] = true;
        }
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set[i])
                continue;
            if (!set[i] && s.charAt(i) == p.charAt(l)) {
                l++;
            }
            if (l >= p.length())
                return true;
        }
        return l >= p.length();
    }
}