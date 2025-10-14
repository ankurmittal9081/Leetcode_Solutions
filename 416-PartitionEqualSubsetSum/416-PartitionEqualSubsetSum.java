// Last updated: 10/14/2025, 12:19:27 PM
class Solution {
    public boolean canPartition(int[] arr) {
        int n=arr.length;
        int sum_t=0;
        for(int i:arr)sum_t+=i;
        if(sum_t%2!=0) return false;
        
        int sum=sum_t/2;
        
        boolean dp[][]=new boolean[n][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        
        if(arr[0]<=sum)
            dp[0][arr[0]]=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                boolean notpick=dp[i-1][j];
                boolean pick=false;
                if(j-arr[i]>=0) pick=dp[i-1][j-arr[i]];
                
                dp[i][j]=pick||notpick;
            }
        }
        return dp[n-1][sum];
    }
}