public class Solution {
    public IList<string> BuildArray(int[] target, int n) {
        IList<string> ans = new List<string>();
        int idx=0;
        for(int i=1;i<=n && idx<target.Length;i++) {
            ans.Add("Push");
            if(target[idx]==i){
                idx++;
            }
            else {
                ans.Add("Pop");
            }
        }
        return ans;
    }
}
