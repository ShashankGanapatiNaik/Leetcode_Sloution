class Solution {
    public int findMaxFish(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int maxfish=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int fish=dfs(grid,i,j);
                maxfish=Math.max(fish,maxfish);

            }
        }
        return maxfish;
        
    }

    public int dfs(int[][]grid,int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length ||grid[r][c]==0){
            return 0;
        }
        int fish=grid[r][c];
        grid[r][c]=0;
        fish+=dfs(grid,r-1,c);
        fish+=dfs(grid,r,c-1);
        fish+=dfs(grid,r+1,c);
        fish+=dfs(grid,r,c+1);
        return fish;
    }
}