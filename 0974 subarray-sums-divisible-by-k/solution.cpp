class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        vector<int> fr(k,0);
        fr[0]=1;
        int pr=0,ans=0;
        for(int i:nums) {
            pr+=i;
            int rem=((pr%k)+k)%k;
            ans+=fr[rem]++;
        }
        return ans;
    }
};
