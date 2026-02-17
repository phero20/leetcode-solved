class Solution {
    public int[] decrypt(int[] code, int k) {
       int sum=0;
       int n=code.length;
       int start=0,end=0;
       if(k>0) {
        start=1;
        end=k;
       } else {
        start=n+k;
        end=n-1;
       }

       for(int i=start;i<=end;i++) {
        sum+=code[i%n];
       }
        int ans[]=new int[n];
        for(int i=0;i<n;i++) {
            ans[i]=sum;

            sum-=code[start%n];
            start++;
            end++;
            sum+=code[end%n];
        }
        return ans;
    }
}
