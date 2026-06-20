class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int c = 0;
        for(int i=0;i<k;i++) {
            if(blocks[i] == 'W') {
                c++;
            }
        }
        int mi = c;
        for(int i=k;i<blocks.size();i++) {
            if(blocks[i]=='W') {
                c++;
            } 
            if(blocks[i-k]=='W') {
                c--;
            }
            mi = min(mi,c);
        }
    return mi;
    }
};