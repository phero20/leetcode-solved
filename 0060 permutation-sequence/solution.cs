public class Solution {
    public string GetPermutation(int n, int k) {
        IList<int> li=new List<int>();
        for(int i=1;i<=n;i++) li.Add(i);
        int[] fact=new int[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++) fact[i]=fact[i-1]*i;
        k--;
        StringBuilder ans = new StringBuilder();
        for(int i=n;i>=1;i--) {
            int index=k/fact[i-1];
            ans.Append(li[index]);
            li.RemoveAt(index);
            k%=fact[i-1];
        }
        return ans.ToString();
    }
}
