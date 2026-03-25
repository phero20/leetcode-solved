public class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0, front = 0, side = 0;

        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) top++;       // top view
                rowMax = Math.max(rowMax, grid[i][j]); // front view
                colMax = Math.max(colMax, grid[j][i]); // side view
            }
            front += rowMax;
            side += colMax;
        }

        return top + front + side;
    }
}
