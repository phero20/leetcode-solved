class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        for(char c:target.toCharArray()) {
            sb.append('a');
            ans.add(sb.toString());
            while(sb.charAt(sb.length() - 1) != c) {
                char last = sb.charAt(sb.length() - 1);
                sb.setCharAt(sb.length() - 1, (char)(last + 1));
                ans.add(sb.toString());
            }
        }
        return ans;
    }
}
