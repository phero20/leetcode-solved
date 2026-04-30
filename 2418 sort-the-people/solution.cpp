class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        map<int, string> ma;
        for(int i=0;i<names.size();i++) {
            ma[heights[i]]=names[i];
        }
        vector<string> ans;
        for (const auto& entry : ma) {
            ans.push_back(entry.second);
        }
        int l=0,r=ans.size()-1;
        while(l<=r) {
            string temp = ans[l];
            ans[l++] = ans[r];
            ans[r--] = temp;
        }
        return ans;
    }
};
