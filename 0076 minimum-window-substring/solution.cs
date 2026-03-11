public class Solution {
    public string MinWindow(string s, string t) {

        int[] freq = new int[128];
        int req = 0;

        foreach(char c in t) {
            if(freq[c] == 0) req++;
            freq[c]++;
        }

        int l = 0, r = 0;
        int min = int.MaxValue;
        int start = 0;
        int formed = 0;

        int[] wd = new int[128];

        while(r < s.Length) {

            char c = s[r];
            wd[c]++;

            if(freq[c] != 0 && wd[c] == freq[c])
                formed++;

            while(l <= r && formed == req) {

                if(r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }

                char st = s[l];
                wd[st]--;

                if(freq[st] > 0 && wd[st] < freq[st])
                    formed--;

                l++;
            }

            r++;
        }

        return min == int.MaxValue ? "" : s.Substring(start, min);
    }
}
