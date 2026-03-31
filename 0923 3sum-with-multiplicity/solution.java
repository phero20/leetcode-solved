class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long c=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++) {
            int l=i+1,r=arr.length-1;
            while(l<=r) {
                int sum = arr[i]+arr[l]+arr[r];
                int lc=1,rc=1;
                if(sum==target) {
                    if(arr[l]!=arr[r]) {
                        while(l+1 < r && arr[l]==arr[l+1]) {
                             lc++;
                             l++;
                        }
                         while( r-1 > l && arr[r]==arr[r-1]) {
                             rc++;
                             r--;
                        }
                        c+=(long) lc*rc;
                        c %= 1000000007;
                        l++;
                        r--;
                    } else {
                        int M = r-l+1;
                        c+=(long)M * (M - 1) / 2;
                        c %= 1000000007;
                        break;
                    }
                }
                else if(sum < target) l++;
                else r--;
            }
        }
        return (int)c % Integer.MAX_VALUE;
    }
}
