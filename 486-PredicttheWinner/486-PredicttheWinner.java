// Last updated: 10/13/2025, 9:12:11 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer dp[][]=new Integer[n][n];
        return solve(nums,0,n-1,dp)>=0;
    }
    public int solve(int[]arr,int l ,int r,Integer dp[][]){
        if(l==r) return arr[l];
        if(dp[l][r]!=null) return dp[l][r];

        int left=arr[l]-solve(arr,l+1,r,dp);
        int right=arr[r]-solve(arr,l,r-1,dp);
        dp[l][r]=Math.max(left,right);
        return dp[l][r];
    }
}