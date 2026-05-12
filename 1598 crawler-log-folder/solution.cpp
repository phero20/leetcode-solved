class Solution {
public:
    int minOperations(vector<string>& logs) {
        int top = 0;
        for(string s:logs) {
            if(s == ("./")) continue;
            else if(s == ("../")) {
                if(top > 0) top--;
            } else {
                top++;
            }
        }
        return top;
    }
};
