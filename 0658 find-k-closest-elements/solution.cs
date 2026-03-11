public class Solution {
    public IList<int> FindClosestElements(int[] arr, int k, int x) {
        int l=0,r=arr.Length-1;
        while(r-l+1>k) {
            if(Math.Abs(arr[l]-x) > Math.Abs(arr[r]-x)) l++;
            else r--;
        }
        IList<int> ans = new List<int>();
        for(int i=l;i<=r;i++) ans.Add(arr[i]);
        return ans;
    }
}
