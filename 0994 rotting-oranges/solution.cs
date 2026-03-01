public class Solution {
    public int OrangesRotting(int[][] grid) {
        LinkedList<int[]> queue = new LinkedList<int[]>();
        int fresh=0,row=grid.Length,col=grid[0].Length;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(grid[i][j]==2) queue.AddLast(new int[]{i,j,0});
                else if(grid[i][j]==1) fresh++;
            }
        }
        int[][] dir = new int[][] {
         new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}
        };
        int maxm=0;
        while(queue.Count>0) {
            int[] curr = queue.First.Value;
            queue.RemoveFirst();
            int x=curr[0],y=curr[1],t=curr[2];
            maxm=Math.Max(maxm,t);
            foreach(var d in dir) {
                int i = x+d[0];
                int j = y+d[1];
                if(i>=0 && j>=0 && i<row && j<col && grid[i][j]==1) {
                    grid[i][j]=2;
                    queue.AddLast(new int[]{i,j,t+1});
                    fresh--;
                }
            } 
        }
        return fresh==0 ? maxm : -1;
    }
}
