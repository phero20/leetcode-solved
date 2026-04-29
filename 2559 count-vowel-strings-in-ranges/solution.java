class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] pr = new int[words.length+1];
        boolean[] vw = new boolean[26];
        vw['a'-'a'] = vw['e'-'a'] = vw['i'-'a'] = vw['o'-'a'] = vw['u'-'a'] = true;
        for(int i=0;i<words.length;i++) {
            String s = words[i];
            pr[i+1] = pr[i] + ((vw[s.charAt(0)-'a'] && vw[s.charAt(s.length()-1)-'a']) ? 1 : 0);
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            int st = queries[i][0];
            int ed = queries[i][1];
            ans[i] = pr[ed+1]-pr[st];
        }
        return ans;
    }
}
