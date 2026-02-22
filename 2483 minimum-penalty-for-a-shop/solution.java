class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int pe=0,best=0,ans=0;
        for(int i=0;i<n;i++) {
            if(customers.charAt(i)=='Y') {
                pe--;
                if(pe<best) {
                    best=pe;
                    ans=i+1;
                }
            } else {
                pe++;
            }
        }
        return ans;
    }
}
