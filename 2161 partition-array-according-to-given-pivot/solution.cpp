class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
       int p1=0,p2=0,p3=0;
       vector<int> ans(nums.size());
        for(int i:nums) {
            if(i<pivot) p2++;
            else if(i==pivot) p3++;
        }
        p3+=p2;
        for(int i:nums) {
            if(i < pivot) ans[p1++] = i;
            else if(i==pivot) ans[p2++] = i;
            else ans[p3++]=i;
        }
        return ans;
    }
};
