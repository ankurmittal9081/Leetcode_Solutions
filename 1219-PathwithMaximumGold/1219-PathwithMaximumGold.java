// Last updated: 10/6/2025, 6:06:10 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max,solve(grid,i,j,n,m,0));
                    
                }
            }
        }
       return max;

    }

    public int solve(int arr[][],int cr,int cc,int er,int ec,int ans){

            if(cr<0 || cc<0 ||cr>=er || cc>=ec || arr[cr][cc]==0){
                return ans;
            }
            int temp=arr[cr][cc];
            arr[cr][cc]=0;

           int up= solve(arr,cr-1,cc,er,ec,ans+temp);
            int down=solve(arr,cr+1,cc,er,ec,ans+temp);
            int left=solve(arr,cr,cc-1,er,ec,ans+temp);
            int right=solve(arr,cr,cc+1,er,ec,ans+temp);

            arr[cr][cc]=temp;
            int max=Math.max(Math.max(up,down),Math.max(left,right));
            return max;

    }
}