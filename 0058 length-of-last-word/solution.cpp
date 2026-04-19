class Solution {
public:
    int lengthOfLastWord(string s) {
        int l = s.size()-1;
            while(l>=0 && s[l]==' ') l--;
            int temp = l;
            while(l>=0 && s[l]!=' ') l--;
            return temp-l;
    }
};
