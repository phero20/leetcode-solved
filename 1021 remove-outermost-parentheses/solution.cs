public class Solution {
    public string RemoveOuterParentheses(string s) {
       StringBuilder res = new StringBuilder();
       int bal=0;
       foreach(var c in s) {
            if(c=='('){
                if(bal>0) res.Append(c);
                bal++;
            } else {
                --bal;
                if(bal>0) res.Append(c);
            }
       }
       return res.ToString();
    }
}
