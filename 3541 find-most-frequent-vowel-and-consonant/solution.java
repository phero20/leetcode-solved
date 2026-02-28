class Solution {
    public int maxFreqSum(String s) {
        int[] ch=new int[126];
        boolean[] v = new boolean[126];
v['a']=v['e']=v['i']=v['o']=v['u']=true;
        int vmax=0,cmax=0;
        for(char c:s.toCharArray()){
            ch[c]++;
            if(v[c])
                vmax=Math.max(vmax,ch[c]);
            else 
                cmax=Math.max(cmax,ch[c]);
        }
        return vmax+cmax;
        
    }
}
