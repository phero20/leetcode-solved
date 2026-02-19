class Solution {
    public int maximumLengthSubstring(String s) {
        int arr[]=new int[126];
        int l=0,r=0,m=0;

        while(r<s.length()) {
            arr[s.charAt(r)]++;
            while(arr[s.charAt(r)]>2) {
                arr[s.charAt(l)]--;
                l++;
            }
            m=Math.max(m,r-l+1);
            r++;
        }
        return m;
    }
}
