// Last updated: 9/16/2025, 9:33:06 AM
class Solution {
    public int arrangeCoins(int n) {
        long l=1,r=n;
        while(l<=r){
            long mid=l+(r-l)/2;
            long c=(mid*(mid+1))/2;
            if(c==n){
                return (int)mid;

            }
            else if(c>n){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)r;
        
    }
}