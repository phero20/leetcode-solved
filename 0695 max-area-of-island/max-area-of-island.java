class Solution {
    int rows,cols;
    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int ans = 0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                ans = Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 ||
           j < 0 ||
           i >= rows ||
           j >= cols ||
           grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(grid,i-1,j);
        count += dfs(grid,i+1,j);
        count += dfs(grid,i,j-1);
        count += dfs(grid,i,j+1);
        return count;
    }
}