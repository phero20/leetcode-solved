class Solution {
    
    boolean[][] visited;
    int rows,cols;
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        int ans = 0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid,int i,int j) {
        if(i < 0 || j < 0 || i >= rows || j >= cols) {
            return;
        }
        if(grid[i][j] == '0' || visited[i][j]) return;
        visited[i][j] = true;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }

}