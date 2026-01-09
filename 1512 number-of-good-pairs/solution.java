class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[101];
        for(int num:nums) arr[num]++;
        int sum=0;
        for(int value:arr) {
            if(value>1){
                int v=(value*(value-1))/2;
                sum+=v;
            }
        }
        return sum;
    }
}
