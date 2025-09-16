// Last updated: 9/16/2025, 9:34:30 AM
class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int l=1;
        int r=x;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid==x/mid){
                return mid;
            }

            else if(mid<x/mid){
                ans=mid;
                l=mid+1;
                
            }
            else{
                r=mid-1;
            }
            
        }
        return ans;
    }
}