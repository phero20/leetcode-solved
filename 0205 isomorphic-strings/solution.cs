public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if(s.Length!=t.Length) return false;
        int[] a=new int[300];
        int[] b=new int[300];
        for(int i=0;i<s.Length;i++){
            if(a[s[i]]!=b[t[i]]) return false;
            a[s[i]]=i+1;
            b[t[i]]=i+1;
        }
        return true;
    }
}
