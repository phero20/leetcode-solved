public class Solution {
    public int MinCost(string s, int[] neededTime) {
        int l = 0;
        for(int i=1;i<neededTime.Length;i++) {
            if(s[i]==s[i-1]) {
                l+=Math.Min(neededTime[i-1],neededTime[i]);
                neededTime[i] = Math.Max(neededTime[i],neededTime[i-1]);
            }
        }
        return l;
    }
}
