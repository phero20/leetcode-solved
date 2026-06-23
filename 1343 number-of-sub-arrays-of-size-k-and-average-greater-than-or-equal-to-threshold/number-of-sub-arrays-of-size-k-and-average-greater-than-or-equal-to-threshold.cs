public class Solution {
    public int NumOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, ans = 0, t=k*threshold;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
        }
        if(sum>=t) {
            ans++;
        }
        for(int i=k;i<arr.Length;i++) {
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum >= t) {
                ans++;
            }
        }
        return ans;
    }
}