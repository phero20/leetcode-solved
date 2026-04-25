class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        set<string> s;
        for(auto &l:paths) s.insert(l[0]);
        for(auto &l:paths) {
            if(s.count(l[1])==0) return l[1];
        }
        return "";
    }
};
