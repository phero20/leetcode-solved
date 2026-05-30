class Solution {
public:
    int minimizedMaximum(int n, vector<int>& q) {
         int l=1,r=0;
        for(int i: q) r=max(r,i);
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(pos(q,mid,n)) {
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    bool pos(vector<int> q,int m,int n) {
        int sum = 0;
        for(int i : q) {
            sum+=(i+m-1)/m;
            if(sum > n) return false;
        }
        return true;
    }
};
