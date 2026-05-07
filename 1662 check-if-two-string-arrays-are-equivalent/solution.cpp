class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& w1, vector<string>& w2) {
        int m=w1.size(),n=w2.size();
        int i=0,j=0,ii=0,jj=0;
        while(i<m && j<n) {
            if(w1[i][ii]==w2[j][jj]) {
                if(w1[i].size()-1==ii) {
                    ii=0;
                    i++;
                } else ii++;
                if(w2[j].size()-1==jj) {
                    jj=0;
                    j++;
                } else jj++;
            } else {
                return false;
            }
        }
        return i==m && j==n;
    }
};
