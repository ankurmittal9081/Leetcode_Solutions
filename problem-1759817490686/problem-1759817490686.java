// Last updated: 10/7/2025, 11:41:30 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        if(k<=1) return 0;

        int l=0;
        int p=1;
        int c=0;
        for(int r=0;r<n;r++){
            p*=nums[r];
            while(p>=k){
                p/=nums[l++];
            }
            c+=r-l+1;
        }
        return c;

    }
}