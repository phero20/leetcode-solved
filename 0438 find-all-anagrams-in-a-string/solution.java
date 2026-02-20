class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
       if (s.length() < p.length()) return ans;
       int c1[]=new int[126];
       int c2[]=new int[126];
       int k=p.length();
       for(int i=0;i<k;i++) {
        c1[p.charAt(i)]++;
        c2[s.charAt(i)]++;
       }
       if (Arrays.equals(c1, c2)) ans.add(0);
       for(int r=k;r<s.length();r++) {
        c2[s.charAt(r-k)]--;
        c2[s.charAt(r)]++;
        if (Arrays.equals(c1, c2)) ans.add(r-k+1);
       }
        return ans;
    }
}
