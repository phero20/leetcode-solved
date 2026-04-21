class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int st[10001];
        int top = -1;
        int map[10001];
        memset(map, -1, sizeof(map));
        for(int i:nums2) {
            while(top!=-1 && st[top] < i) {
                map[st[top--]] = i;
            }
            st[++top] = i;
        }
        vector<int> ans;
        for(int i:nums1) {
            ans.push_back(map[i]);
        }
        return ans;
    }
};
