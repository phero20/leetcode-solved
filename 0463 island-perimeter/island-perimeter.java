class Solution {
    boolean[][] visited;
    int rows,cols;
    public int islandPerimeter(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(grid[i][j] == 1) {
                    return dfs(grid,i,j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid,int r,int c) {
        if(r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c]==0) {
            return 0;
        }
        if(visited[r][c]) {
            return 0;
        }

        visited[r][c] = true;
        int p = 4;

        if(r > 0 && grid[r-1][c]==1) p--;
        if(r < rows-1 && grid[r+1][c]==1) p--;
        if(c > 0 && grid[r][c-1]==1) p--;
        if(c < cols-1 && grid[r][c+1]==1) p--;

        p += dfs(grid,r-1,c);
        p += dfs(grid,r+1,c);
        p += dfs(grid,r,c-1);
        p += dfs(grid,r,c+1);
        return p;
        
    }
}