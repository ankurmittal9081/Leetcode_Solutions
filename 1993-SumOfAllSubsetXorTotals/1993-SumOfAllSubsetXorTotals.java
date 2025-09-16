// Last updated: 9/16/2025, 9:32:29 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    public static int helper(int nums[],int i,int xor){
        if(i==nums.length){
            return xor;
        }

        int exclude=helper(nums,i+1,xor);
        int include=helper(nums,i+1,xor^nums[i]);
        return exclude+include;
    }
}