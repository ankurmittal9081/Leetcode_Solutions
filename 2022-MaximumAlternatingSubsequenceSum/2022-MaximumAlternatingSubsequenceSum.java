// Last updated: 9/16/2025, 9:32:28 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long even=0,odd=0;
        for(int i: nums){
            long n_even=Math.max(even,odd+i);
            long n_odd=Math.max(odd,even-i);
            even=n_even;
            odd=n_odd;
        }
        return even;
        
    }
}