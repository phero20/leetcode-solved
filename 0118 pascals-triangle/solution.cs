public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> ans = new List<IList<int>>();
        for(int i=0;i<numRows;i++) {
            IList<int> l = new List<int>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    l.Add(1);
                } else {
                    int n=ans[i-1][j]+ans[i-1][j-1];
                    l.Add(n);
                }
            }
             ans.Add(l);
        }
        return ans;
    }
}
