public class Solution {
    public string SimplifyPath(string path) {
        string[] parts = path.Split('/');
        string[] st = new string[parts.Length];
        int top=-1;
        foreach(var i in parts) {
            if(i=="." || i=="") continue;
            else if(i=="..") {if(top!=-1) top--;}
            else st[++top]=i;
        }
        var sb = new StringBuilder();
        for(int i=0;i<=top;i++) {
            sb.Append("/").Append(st[i]);
        }
        return sb.Length==0 ? "/" : sb.ToString();
    }
}
