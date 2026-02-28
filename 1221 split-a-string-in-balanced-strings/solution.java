class Solution {
    public int balancedStringSplit(String s) {
        int r=0,l=0,cr=0;
        for(char c:s.toCharArray()){
            if(c=='R') r++;
            else l++;
            if(r==l) cr++;
        }
        return cr;
    }
}
