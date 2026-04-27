class Solution {
    public List<String> commonChars(String[] words) {
        int[] set = new int[26];
        Arrays.fill(set,Integer.MAX_VALUE);
        for(String s:words) {
            int[] setIn = new int[26];
            for(char c:s.toCharArray()) setIn[c-'a']++;
            for(int i=0;i<26;i++) {
                set[i] = Math.min(set[i],setIn[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<26;i++) {
            for(int j=0;j<set[i];j++) {
                ans.add(Character.toString((char)('a'+i)));
            }
        }
        return ans;
    }
}
