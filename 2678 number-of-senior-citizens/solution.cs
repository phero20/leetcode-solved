public class Solution {
    public int CountSeniors(string[] details) {
        int ans = 0;
        foreach(string s in details) {
            string sub = s.Substring(11,2);
            int age = int.Parse(sub);
            if(age>60) ans++;
        }
        return ans;
    }
}
