class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[26];
        for(char c:allowed.toCharArray()) set[c-'a'] = true;
        int ans = 0;
        for(String w:words) {
            boolean is = true;
            for(char c:w.toCharArray()) {
                if(!set[c-'a']) {
                    is = false;
                    break;
                }
            }
            if(is) ans++;
        }
        return ans;
    }
}
