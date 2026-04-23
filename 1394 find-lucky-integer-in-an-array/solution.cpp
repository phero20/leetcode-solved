class Solution {
public:
    int findLucky(vector<int>& arr) {
        vector<int> c(1010,0);
        for(int i:arr) c[i]++;
        int m = -1;
        for(int i:arr) {
            if(i==c[i]) m = max(m,i);
        }
        return m;
    }
};
