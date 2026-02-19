class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,mxl=0,mxf=0;
        int c[]=new int[126];
        for(int r=0;r<s.length();r++) {
            c[s.charAt(r)]++;
            mxf=Math.max(mxf,c[s.charAt(r)]);
            while((r-l+1)-mxf > k) {
                c[s.charAt(l)]--;
                l++;
            }
            mxl=Math.max(mxl,r-l+1);
        }
        return mxl;
    }
}
