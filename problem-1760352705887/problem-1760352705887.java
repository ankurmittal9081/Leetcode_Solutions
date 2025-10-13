// Last updated: 10/13/2025, 4:21:45 PM
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return solve(grid,dp,0,0,m,n);

    }
    public int solve(int grid[][],int dp[][],int cr,int cc,int er,int ec){
        if(cr>=er||cc>=ec) return Integer.MAX_VALUE;

        if(cr==er-1 && cc==ec-1) return grid[cr][cc];

        if(dp[cr][cc]!=-1) return dp[cr][cc];

        int a=solve(grid,dp,cr+1,cc,er,ec);
        int b= solve(grid,dp,cr,cc+1,er,ec);

        
        dp[cr][cc]=grid[cr][cc]+Math.min(a,b);
        return dp[cr][cc];
        
    }
}