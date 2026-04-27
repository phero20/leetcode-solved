class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> f(126,0);
        for(char c:s) f[c]++;
        int sum = 0;
        bool b = false;
        for(int i:f) {
            if(i!=0 && (i&1)==0) sum+=i;
            else if(i!=0) {
                sum+=i-1;
                b=true;
            }
        }
        return sum+(b ?1 : 0);
    }
};
