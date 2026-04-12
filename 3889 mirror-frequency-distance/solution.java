class Solution {
    public int mirrorFrequency(String s) {
        int[] set = new int[128];
        boolean[] seen = new boolean[128];
        for(char c:s.toCharArray()) set[c]++;
        int ans = 0;
        for(char c:s.toCharArray()) {
            if(!seen[c]) {
                int cf=set[c],mf=0;
                if( c >= '0' && c <= '9' ) {
                    mf = '9' - (c - '0');  
                } else if (c >= 'a' && c <= 'z') {
                    mf = 'z' - (c - 'a');
                } else {
                    continue;
                }
                ans+= Math.abs(cf-set[mf]);
                seen[c]=seen[mf]=true;
            }
        }
        return ans;
    }
}
