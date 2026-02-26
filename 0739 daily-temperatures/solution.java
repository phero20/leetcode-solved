class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] st = new int[t.length];
        int res[]=new int[t.length];
        int top=-1;
        for(int i=0;i<t.length;i++) {
            while(top!=-1 && t[st[top]]<t[i]){
               res[st[top]]=i-st[top--];
            }
            st[++top]=i;
        }
        return res;
    }
}
