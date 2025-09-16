// Last updated: 9/16/2025, 9:33:09 AM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long l=1,r=n;
        while(l<=r){
            long mid=l+(r-l)/2;
            long res=guess((int)mid);
            if(res==0){
                return (int)mid;
            }
            else if(res<0){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
        
    }
}