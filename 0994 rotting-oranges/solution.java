class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(grid[i][j]==2) {
                    queue.add(new int[]{i,j,0});
                } else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        int[][] direction ={{1,0}, {-1,0}, {0,1}, {0,-1}};
        int maxm=0,r=0,c=0,x=0,y=0,t=0;
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            x=curr[0];
            y=curr[1];
            t=curr[2];
            maxm=Math.max(maxm,t);
            for(int[] d:direction) {
                r=x+d[0];
                c=y+d[1];
                if(r>=0 && r<row && c>=0 && c<col && grid[r][c] == 1) {
                    grid[r][c]=2;
                    queue.add(new int[]{r,c,t+1});
                    fresh--;
                }
            }
        }
        return fresh==0 ? maxm :-1;
    }
}
