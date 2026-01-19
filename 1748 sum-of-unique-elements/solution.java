class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int[] arr = new int[500];
        for(int i:nums) arr[i]++;
        for(int i:nums){
            if(arr[i]==1) sum+=i;
        }
        return sum;
    }
}
