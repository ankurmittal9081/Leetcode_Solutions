// Last updated: 9/16/2025, 9:34:27 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int  l=0;
        int h=r*c-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int r1=mid/c;
            int c2=mid%c;
            if(matrix[r1][c2]==target){
                return true;
            }
            else if(matrix[r1][c2]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}