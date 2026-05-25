public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        int l = 0, r = m*n-1;
        while( l <= r ) {
            int mid = l+(r-l)/2;
            int ro = mid/n;
            int c = mid%n;
            if(matrix[ro][c]==target) return true;
            else if(matrix[ro][c] < target) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}
