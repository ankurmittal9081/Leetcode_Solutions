// Last updated: 10/4/2025, 2:17:57 PM
class Solution {
    public int climbStairs(int n) {
        return solveTD(n,new int[n+1]);
    }

     public static int solveTD(int n,int dp[]){
        if(n==0 || n==1) return 1;
        if(dp[n]!=0) return dp[n];
        int f=solveTD(n-1,dp);
        int l=solveTD(n-2,dp);
        dp[n]=f+l;
        return dp[n];
    }
}