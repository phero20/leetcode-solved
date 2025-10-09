class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        while (i < haystack.length()) {
            char ch = haystack.charAt(i);
            char n = needle.charAt(j);
            if (ch == n) {
                i++;
                j++;
                if (j == needle.length())
                    return i - needle.length();
            } else {
                i=i-j+1;
                j = 0;
            }
            if (j == needle.length())
                return i-needle.length();
        }
        return -1;
    }
}
