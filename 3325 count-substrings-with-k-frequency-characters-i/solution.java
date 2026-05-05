class Solution {
    public int numberOfSubstrings(String s, int k) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int fr[] = new int[26];
            for(int j=i;j<s.length();j++) {
                fr[s.charAt(j)-'a']++;
                if (fr[s.charAt(j) - 'a'] >= k) {
                    ans+=(s.length()-j);
                    break;
                }
            }
        }
        return ans;
    }
}
