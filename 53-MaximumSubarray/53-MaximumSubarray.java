// Last updated: 9/29/2025, 1:30:04 PM
class Solution {
    public int maxSubArray(int[] nums) {
        // int l=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
            

        }   

        return max;
    }
}