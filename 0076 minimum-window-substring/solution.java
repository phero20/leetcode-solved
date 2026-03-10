class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[126];
        int required = 0;
        for (char i : t.toCharArray()) {
            required += freq[i] == 0 ? 1 : 0;
            freq[i]++;
        }
        int left = 0, right=0;
        int formed = 0, minLength = Integer.MAX_VALUE, start = 0;
        int[] window = new int[126];
        while (right < s.length()) {
            char c = s.charAt(right);
            window[c]++;
            if (freq[c] != 0 && (window[c] == freq[c]))
                formed++;
            while (left <=right && required == formed) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char st = s.charAt(left);
                window[st]--;
                if (freq[st] > 0 && window[st] < freq[st]) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
