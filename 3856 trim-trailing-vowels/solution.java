class Solution {
    public String trimTrailingVowels(String s) {
        int r=s.length()-1;
        boolean[] v = new boolean[126];
        v['a']=v['e']=v['i']=v['o']=v['u']=true;
        while(r>=0) {
            if(!v[s.charAt(r)])  break;
            r--;
        }
        return s.substring(0,r+1);
    }
}
