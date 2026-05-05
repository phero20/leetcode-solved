class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] second = new int[26];
        for(int i=0;i<26;i++) {
            first[i]=-1;
            second[i]=-1;
        }
        for(int i=0;i<s.length();i++) {
            int idx = s.charAt(i)-'a';
            if(first[idx] == -1) first[idx]=i;
            second[idx]=i;
        }
        int res = 0;
        for(int i=0;i<26;i++) {
            if(first[i]!=-1 && second[i]!=-1 && first[i] < second[i]) {
                boolean[] seen = new boolean[26];
                for(int j=first[i]+1;j<second[i];j++) {
                    seen[s.charAt(j)-'a'] = true;
                }
                for(int j=0;j<26;j++) {
                    if(seen[j]) res++;
                }
            }
        }
        return res;
    }
}
