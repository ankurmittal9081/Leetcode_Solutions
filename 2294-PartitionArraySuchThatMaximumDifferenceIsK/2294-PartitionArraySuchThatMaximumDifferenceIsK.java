// Last updated: 10/14/2025, 6:07:27 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[0];
        int c=0;
        for(int i:nums){
            int d=i-mid;
            if(d<=k) continue;
            else {
                c++;
                mid=i;
            }
        }
        return c+1;
    }
}