// Last updated: 9/26/2025, 4:13:45 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=nums.length;
        int res[]=new int[m];
        int index=0;
        for(int i=0;i<n;i++){
            res[index++]=nums[i];
            res[index++]=nums[i+n];
        }
        return res;
        
    }
}