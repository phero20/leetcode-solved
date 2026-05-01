class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        vector<int> fr(201,0);
        for(int i:nums) fr[i+100]++;
        int mxf = -1;
        for(int i:fr) mxf = max(mxf,i);
        vector<int> ans;
        for(int i=1;i<=mxf;i++) {
            for(int j=200;j>=0;j--) {
                if(fr[j]==i) {
                    while(fr[j] > 0) {
                        ans.push_back(j-100);
                        fr[j]--;
                    }
                }               
            }
        }
        return ans;
    }
};
