public class Solution {
    public int AppendCharacters(string s, string t) {
        int j=0,ct=0;
        foreach(var c in s) {
            if(j<t.Length && c==t[j]){
                ct++;
                j++;
            }
        }
        return t.Length-ct;
    }
}
