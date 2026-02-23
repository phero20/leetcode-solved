class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] pr=new boolean[right+1];
        pr[0]=pr[1]=true;
        for(int i=2;i*i<=right;i++) {
            if (!pr[i]) {
                for(int j=i*i;j<=right;j+=i) pr[j]=true;
            }
        }

        int prev=-1;
        int[] res={-1,-1};
        int diff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++) {
            if(!pr[i]) {
                if(prev!=-1 && i-prev<diff) {
                    res[0]=prev;
                    res[1]=i;
                    diff=i-prev;
                }
                prev=i;
            }
            
        }
        return res;
    }
}
