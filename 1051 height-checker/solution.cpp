class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> c(101,0);
        for(int i:heights) c[i]++;
        int ans = 0,m=1;
        for(int h:heights) {
            while(m<=100 && c[m]==0) m++;
            if(h!=m) ans++;
            c[m]--;
        }
        return ans;
    }
};
