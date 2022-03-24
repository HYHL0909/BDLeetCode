package day08;

public class MaxAreaIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int max=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(grid[i][j]==1){
                    int a=dfs(grid,i,j);
                    max=Math.max(max,a);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        int r=grid.length;
        int c=grid[0].length;

        if(notInArea(grid,i,j))
            return 0;
        if(grid[i][j]==0||grid[i][j]==2)
            return 0;

        grid[i][j]=2;
        return 1+dfs(grid, i-1, j)+dfs(grid, i+1, j)+dfs(grid, i, j-1)+dfs(grid, i, j+1);
    }

    private boolean notInArea(int[][] grid, int i, int j) {
        int r=grid.length;
        int c=grid[0].length;
        return i>=r||i<0|j<0||j>=c;
    }
}
