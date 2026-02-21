class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr=new int[k];
        arr[0]=1;
        int sum=0,count=0;
        for(int i:nums) {
            sum+=i;
            int rem=((sum%k)+k)%k;
            count+=arr[rem]++;
        }
        return count;
    }
}
