class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[26];
        int[] focc = new int [26];
        Arrays.fill(focc,-1);
        List<Character> chl = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
                freq[c-'a']++;
                if(focc[c-'a']==-1) focc[c-'a'] = i;
                chl.add(c);
            }
        }
        Collections.sort(chl,(a,b)->{
            int afr = freq[a-'a'];
            int bfr = freq[b-'a'];
            if(afr != bfr) return bfr-afr;
            else return focc[a-'a'] - focc[b-'a'];
        });
        StringBuilder res = new StringBuilder();
        int vidx = 0;
        for(char c:s.toCharArray()) {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                res.append(chl.get(vidx++));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
