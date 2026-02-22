public class Solution {
    public int MaxScore(string s) {
        int o=0,z=0,max=0;
        foreach(char i in s) if(i=='1') o++;
        for(int i=0;i<s.Length-1;i++) {
            if(s[i]=='0') z++;
            else o--;
            max=Math.Max(max,o+z);
        } 
        return max;
    }
}
