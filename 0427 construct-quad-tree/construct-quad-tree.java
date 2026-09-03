class Solution {
    public Node construct(int[][] grid) {
        return build(grid,0,0,grid.length);
    }

    private Node build(int[][] grid,int r,int c,int size) {
        if(check(grid,r,c,size)) {
            return new Node(grid[r][c]==1,true);
        }

        int n = size/2;
        Node tl = build(grid,r,c,n);
        Node tr = build(grid,r,c+n,n);
        Node bl = build(grid,r+n,c,n);
        Node br = build(grid,r+n,c+n,n);

        Node node = new Node(true,false);
        node.topLeft = tl;
        node.topRight = tr;
        node.bottomLeft = bl;
        node.bottomRight = br;
        return node;
    }

    private boolean check(int[][] grid,int r,int c,int s) {
        int v = grid[r][c];
        for(int i=r;i<r+s;i++) {
            for(int j=c;j<c+s;j++) {
                if(grid[i][j]!=v) return false;
            }
        }
        return true;
    }
}