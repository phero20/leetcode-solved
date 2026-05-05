class Solution {
public:
    bool isPalindrome(string s) {
        int l = 0,r=s.size()-1;
        while(l<r) {
            while(l<r && !isChar(s[l])) l++;
            while(l<r && !isChar(s[r])) r--;
            char lr = tolower(static_cast<unsigned char>(s[l]));
            char rr = tolower(static_cast<unsigned char>(s[r]));
            if(lr!=rr) return false;
            l++;
            r--;
        }
        return true;
    }
    bool isChar(char c) {
        return std::isalnum(static_cast<unsigned char>(c));
    }
};
