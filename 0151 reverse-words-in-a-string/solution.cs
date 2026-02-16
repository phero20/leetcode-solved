public class Solution {
    public string ReverseWords(string s) {
        StringBuilder ans = new StringBuilder();
        int i=s.Length-1,j=0;

        while(i>=j) {
            while(i>=j && s[i]==' ') i--;
            if(i<j) break;
            int end = i;
            while(i>=j && s[i]!=' ') i--;
            string sub = s.Substring(i+1,end-i);
            if(ans.Length>0) {
                ans.Append(" ");
            } 
            ans.Append(sub);
        }
        return ans.ToString();
    }
}
