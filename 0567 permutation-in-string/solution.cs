public class Solution {
    public bool CheckInclusion(string s1, string s2) {
        if(s1.Length>s2.Length) return false;
        int[] c1=new int[126];
        int[] c2=new int[126];
        int k=s1.Length;
        for(int i=0;i<k;i++) {
            c1[s1[i]]++;
            c2[s2[i]]++;
        }
        if (c1.SequenceEqual(c2)) return true;

        for(int r=k;r<s2.Length;r++){
            c2[s2[r-k]]--;
            c2[s2[r]]++;
            if (c1.SequenceEqual(c2)) return true;

        }
        return false;
    }
}
