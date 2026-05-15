public class Solution {
    public int MinAddToMakeValid(string s) {
        int bl = 0;
        int inn = 0;
        foreach(char c in s) {
            if(c=='(') {
                inn++;
            } else {
                if(inn > 0) inn--;
                else bl++; 
            }
        }
        return bl + inn;
    }
}
