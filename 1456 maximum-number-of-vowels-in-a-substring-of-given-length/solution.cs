public class Solution {
    public int MaxVowels(string s, int k) {
        int count=0;
        bool[] v = new bool[126];
        int max=0;
        v['a']=v['e']=v['i']=v['o']=v['u']=true;
        for(int i=0;i<s.Length;i++) {
            if(v[s[i]]) count++;
            if(i>=k && v[s[i-k]]) count--;
            max=Math.Max(max,count);
        }
        return max;
    }
}
