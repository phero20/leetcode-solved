class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length*grid.length;
        boolean[] set = new boolean[m];
        int[] ans = new int[2];
        for(int[] arr: grid) {
            for(int i:arr) {
                if(set[i-1]) ans[0] = i;
                set[i-1] = true;
            }
        }
        for(int i=1;i<=m;i++) {
            if(!set[i-1]) {
                ans[1] = i;
                break;
            }
        }       
        return ans; 
    }
}
