class Solution {
    public String largestGoodInteger(String num) {
        String[]  ans = {
            "999","888","777","666","555","444","333","222","111","000"
        };
        for(String s:ans) {
            if(num.contains(s)) return s;
        }
        return "";
    }
}
