// Last updated: 10/7/2025, 11:37:56 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0;
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int r=0;r<n;r++){
            sum+=nums[r];

            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=nums[l++];
            }
        }

        return min==Integer.MAX_VALUE?0:min;
    }
}