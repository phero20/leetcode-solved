class Solution {
public:
    string largestGoodInteger(string num) {
        string  ans[] = {
            "999","888","777","666","555","444","333","222","111","000"
        };
        for(string s:ans) {
            if(num.contains(s)) return s;
        }
        return "";
    }
};
