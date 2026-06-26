class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int sum = 0;
        int l=0,ans=0;
        for(int i=0;i<grumpy.size();i++) if(grumpy[i]==0) sum+=customers[i];
        for(int i=0;i<minutes;i++) {
            if(grumpy[i]==1) {
                sum+=customers[i];
            }
        }
        ans=sum;
        for(int i=minutes;i<customers.size();i++) {
            if(grumpy[i]==1) sum+=customers[i];
            if(grumpy[i-minutes]==1) sum-=customers[i-minutes];
            ans=max(ans,sum);
        }
        return ans;
    }
};