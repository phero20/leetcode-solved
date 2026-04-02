class Solution {
    public String maximumXor(String s, String t) {
        int o=0,z=0;
        for(char c:t.toCharArray()) {
            if(c=='1') o++;
            else z++;
        }
        StringBuilder res = new StringBuilder();
        for(char c:s.toCharArray()) {
            if(c=='0' && o>0) {
                res.append('1');
                o--;
            } else if(c=='1' && z>0) {
                res.append('1');
                z--;
            } else {
                res.append('0');
                if(c=='0') z--;
                else o--;
            }
        }
        return res.toString();
    }
}
