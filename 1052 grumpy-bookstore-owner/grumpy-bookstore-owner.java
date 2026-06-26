class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int l=0,ans=0;
        for(int i=0;i<grumpy.length;i++) if(grumpy[i]==0) sum+=customers[i];
        for(int i=0;i<minutes;i++) {
            if(grumpy[i]==1) {
                sum+=customers[i];
            }
        }
        ans=sum;
        for(int i=minutes;i<customers.length;i++) {
            if(grumpy[i]==1) sum+=customers[i];
            if(grumpy[i-minutes]==1) sum-=customers[i-minutes];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}