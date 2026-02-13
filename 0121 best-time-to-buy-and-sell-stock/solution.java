class Solution {
    public int maxProfit(int[] prices) {
    int low= Integer.MAX_VALUE;
    int gap = 0;
    for(int i:prices) {
        if(low>i) low=i;
        else gap = Math.max(gap,i-low);
    }
    return gap; 
    }
}
