class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = Character.toUpperCase(s.charAt(i));
            if (c == '-') continue;
            if (j == k) {
                ans.append('-');
                    j = 0;
                }
            ans.append(c);
            j++;
        }
        return ans.reverse().toString();
    }
}
