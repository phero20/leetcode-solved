public class Solution {
    public int NumberOfSteps(int num) {
       return c(num,0);
    }
    private int c(int num,int ct) {
        if( num ==0 ) return ct;
        if(num%2==0) return c(num/2,ct+1);
        else return c(num-1,ct+1); 
    }
}
