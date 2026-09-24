class Solution {
    int[] map;
    public boolean isAlienSorted(String[] words, String order) {
        map = new int[26];
        for(int i=0;i<order.length();i++) {
            map[order.charAt(i)-'a'] = i;
        }
        return check(words,0);
    }

    private boolean check(String[] words,int i) {
        if(i == words.length - 1) return true;
        String a = words[i], b = words[i+1];
        int n = Math.min(a.length(),b.length());
        for(int j=0;j<n;j++) {
            int r1 = map[a.charAt(j)-'a'];
            int r2 = map[b.charAt(j)-'a'];
            if(r1 < r2) {
                return check(words,i+1);
            }
            if(r1 > r2) {
                return false;
            }
        }
        return a.length() > b.length() ? false : check(words,i+1);
    }
}