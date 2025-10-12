// Last updated: 10/12/2025, 5:54:22 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;
        if(n==0) return 0;
        int last=Integer.MIN_VALUE;
        int max=1;
        for(int i=0;i<n;i++){
            if(nums[i]-1==last){
                c=c+1;
                last=nums[i];
            }
            else if(nums[i]!=last){
                c=1;
                last=nums[i];
            }
            max=Math.max(max,c);
        }
        return max;
    }
}