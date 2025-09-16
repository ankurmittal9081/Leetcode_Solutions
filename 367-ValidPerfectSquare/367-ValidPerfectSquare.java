// Last updated: 9/16/2025, 9:33:10 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        
        long l=1,r=num;
        while(l<=r){
            long mid=l+(r-l)/2;
            long an=mid*mid;
            if(an==num){
                return true;
            } 
            else if(an>num){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return false;
    }
}