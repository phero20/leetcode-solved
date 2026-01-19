class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[101];
        for(int num:nums) arr[num]++;
        int sum=0;
        for(int i:arr){
            if(i>1) sum+=(i*(i-1))/2;
        }
        return sum;
    }
}
