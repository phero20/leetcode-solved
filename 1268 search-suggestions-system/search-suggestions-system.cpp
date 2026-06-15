class Solution {
public:
    vector<vector<string>> suggestedProducts(vector<string>& products, string searchWord) {
        sort(products.begin(),products.end());
        vector<vector<string>> ans;
        string s = "";
        for(char c:searchWord) {
            s=s+c;
            ans.push_back(bin(s,products));
        }
        return ans;
    }
    vector<string> bin(string s,vector<string> nums) {
        int l=0,r=nums.size()-1;
        vector<string> ans;
        while(l<r) {
            int mid = l+(r-l)/2;
            if(nums[mid].compare(s) < 0) {
                l=mid+1;
            } else {
                r=mid;
            }
        }
        for(int i=l;i<nums.size() && ans.size() < 3 ;i++) {
            if(nums[i].starts_with(s)) {
                ans.push_back(nums[i]);
            } else {
                break;
            }
        }
        return ans;
    }
};