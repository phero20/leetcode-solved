class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int result[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            result[i+1]=result[i]^arr[i];
        }
        int i=0;
        int res[]=new int[queries.length];
        for(int[] row:queries){
            res[i++]=result[row[1]+1]^result[row[0]];
        }
        return res;
    }
}
