public class Solution {
    public int CountPrimes(int n) {
        if(n<=2) return 0;
        bool[] pri=new bool[n];
        pri[0]=pri[1]=true;
        int c=0;
        for(int i=2;i*i<n;i++) {
            if(!pri[i]) {
                 for(int j=i*i;j<n;j+=i) {
                 pri[j]=true;
            }
            }
        }
        foreach(bool b in pri) if(!b) c++;
        return c;
    }
}
