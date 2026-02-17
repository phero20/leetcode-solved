public class Solution {
    public int[] Decrypt(int[] code, int k) {
        int sum=0,start=0,end=0;
        int n=code.Length;
        if(k>0) {
            start=1;
            end=k;
        } else {
            start=n+k;
            end=n-1;
        }
        int[] arr = new int[n];
        for(int i=start;i<=end;i++) {
            sum+=code[i%n];
        }
        for(int i=0;i<n;i++) {
            arr[i]=sum;

            sum-=code[start%n];
            start++;
            end++;
            sum+=code[end%n];
        }
        return arr;
    }
}
