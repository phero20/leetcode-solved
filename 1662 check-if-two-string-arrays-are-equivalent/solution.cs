public class Solution {
    public bool ArrayStringsAreEqual(string[] w1, string[] w2) {
        int m=w1.Length,n=w2.Length;
        int i=0,j=0,ii=0,jj=0;
        while(i<m && j<n) {
            if(w1[i][ii]==w2[j][jj]) {
                if(w1[i].Length-1==ii) {
                    ii=0;
                    i++;
                } else ii++;
                if(w2[j].Length-1==jj) {
                    jj=0;
                    j++;
                } else jj++;
            } else {
                return false;
            }
        }
        return i==m && j==n;
    }
}
