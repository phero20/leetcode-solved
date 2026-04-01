class Solution {
    public int vowelConsonantScore(String s) {
        boolean[] vow = new boolean[126];
        vow['a']=vow['e']=vow['i']=vow['o']=vow['u']=true;
        int v=0,c=0;
        for(char co:s.toCharArray()) {
            if(vow[co]) v++;
            else if(co >= 'a' && co<='z') c++;
        }
        return c > 0 ? (v/c) : 0;
    }
}
