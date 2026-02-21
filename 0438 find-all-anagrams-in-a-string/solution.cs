public class Solution {
    public IList<int> FindAnagrams(string s, string p) {
               IList<int> ans = new List<int>();
       if(s.Length<p.Length) return ans;
       int[] c1=new int[126];
       int[] c2=new int[126];
       int k=p.Length;
       for(int i=0;i<k;i++) {
        c1[p[i]]++;
        c2[s[i]]++;
       }
       if (c1.SequenceEqual(c2)) ans.Add(0);

       for(int r=k;r<s.Length;r++){
            c2[s[r]]++;
            c2[s[r-k]]--;
            if (c1.SequenceEqual(c2)) ans.Add(r-k+1);
       }
    return ans;
    }
}
