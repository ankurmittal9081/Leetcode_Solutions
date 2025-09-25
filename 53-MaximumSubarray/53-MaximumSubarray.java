// Last updated: 9/25/2025, 1:39:48 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int prefix=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            prefix+=i;
            max=Math.max(max,prefix);
            if(prefix<0){
                prefix=0;
            }
        }
        return max;

        
    }
}