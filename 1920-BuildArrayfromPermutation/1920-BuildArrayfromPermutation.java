// Last updated: 9/26/2025, 3:48:42 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length; 
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[nums[i]];
        }
        return res;
        
    }
}