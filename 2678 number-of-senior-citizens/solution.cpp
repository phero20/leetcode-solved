class Solution {
public:
    int countSeniors(vector<string>& details) {
        int ans = 0;
        for(string s:details) {
            string sub = s.substr(11,2);
            int age = stoi(sub);
            if(age > 60) ans++;
        }
        return ans;
    }
};
