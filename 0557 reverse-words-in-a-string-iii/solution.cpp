class Solution {
public:
    string reverseWords(string s) {
        int l = 0;
        for(int i=0;i<s.size();i++) {
            if(s[i]==' ') {
                rev(s,l,i-1);
                l=i+1;
            }
        }
        rev(s,l,s.size()-1);
        return s;
    }
    void rev(string &s,int l,int r) {
        while(l<r) {
            char c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
};
