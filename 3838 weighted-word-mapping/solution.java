class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder st = new StringBuilder();
        for(String s:words) {
            int sum = 0;
            for(char c:s.toCharArray()) {
                sum+=weights[c-'a'];
            }
            st.append((char)('z' - (sum%26)));
        }
        return st.toString();
    }
}
