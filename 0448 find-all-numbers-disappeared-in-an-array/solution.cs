public class Solution {
    public IList<int> FindDisappearedNumbers(int[] nums) {
        IList<int> ans=new List<int>();
        bool[] c=new bool[nums.Length+1];
        foreach(int i in nums) c[i]=true;
        for(int i=1;i<=nums.Length;i++) {
            if(!c[i]) ans.Add(i);
        }
        return ans;
    }
}
