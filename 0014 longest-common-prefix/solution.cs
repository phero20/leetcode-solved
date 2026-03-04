public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        String s = strs[0];
        for(int i=1;i<strs.Length;i++) {
            while(!strs[i].StartsWith(s)) {
                s=s.Substring(0,s.Length-1);
                if(s=="") return "";
            }
        }
        return s;
    }
}
