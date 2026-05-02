class Solution {
public:
    vector<int> minOperations(string boxes) {
        int c =0,o=0;
        vector<int> res(boxes.size(),0);
        for(int i=0;i<boxes.size();i++) {
            o+=c;
            if(boxes[i]=='1') c++;
            res[i]=o;
        }
        c=0;
        o=0;
        for(int i=boxes.size()-1;i>=0;i--) {
            o+=c;
            if(boxes[i]=='1') c++;
            res[i]+=o;
        }
        return res;
    }
};
