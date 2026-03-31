class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
       int prefix=0,n=arr.length;
       while(prefix < n-1 && arr[prefix] <= arr[prefix+1]) prefix++;
       if (prefix == n - 1) return 0;
       int suffix=n-1;
       while (suffix > 0 && arr[suffix] >= arr[suffix - 1]) suffix--;
       int l=0,r=suffix,ans = Math.min(n - 1 - prefix, suffix);
       while(l <= prefix && r < n) {
            if(arr[l] <= arr[r]) {
                ans = Math.min(ans,r-l-1);
                l++;
            } else {
                r++;
            }
       }
       return ans;
    }
}
