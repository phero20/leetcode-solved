class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;
        int[] c1 = new int[126];
        int[] c2 = new int[126];
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            c1[s1.charAt(i)]++;
            c2[s2.charAt(i)]++;
        }
        if (Arrays.equals(c1, c2))
            return true;
        for (int r = k; r < s2.length(); r++) {
            c2[s2.charAt(r)]++;
            c2[s2.charAt(r-k)]--;
            if (Arrays.equals(c1, c2))
                return true;
        }
        return false;
    }
}
