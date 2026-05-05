class Solution {
public:
    vector<string> stringSequence(string target) {
        string str = "";
        vector<string> ans;
        for(char c:target) {
            str+="a";
            ans.push_back(str);
            while(str[str.size()-1]!=c) {
                char last = str.back();
                str.back() = (last == 'z' ? 'a' : last + 1);
                ans.push_back(str);
            }
        }
        return ans;
    }
};
