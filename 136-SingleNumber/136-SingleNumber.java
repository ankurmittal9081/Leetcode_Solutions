// Last updated: 9/16/2025, 9:34:05 AM
class Solution {
    public int singleNumber(int[] nums) {
        
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;

        
    }
}