public class Solution {
    public int MinOperations(string[] logs) {
        int top = 0;
        foreach(string s in logs) {
            if(s == ("./")) continue;
            else if(s == ("../")) {
                if(top > 0) top--;
            } else {
                top++;
            }
        }
        return top;
    }
}
