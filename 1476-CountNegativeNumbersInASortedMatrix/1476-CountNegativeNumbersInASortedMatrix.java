// Last updated: 9/16/2025, 9:32:37 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
        }
        return c;
        
    }
}
//[[5,1,0],[-5,-5,-5]]
//2