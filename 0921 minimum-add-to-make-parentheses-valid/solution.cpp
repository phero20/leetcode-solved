class Solution {
public:
    int minAddToMakeValid(string s) {
        int bl = 0, in = 0;
        for(char c:s) {
            if(c=='(') {
                in++;
            } else {
                if(in > 0) in--;
                else bl++; 
            }
        }
        return bl + in;
    }
};
