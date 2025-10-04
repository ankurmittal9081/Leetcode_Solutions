// Last updated: 10/4/2025, 9:45:01 PM
class Solution {
    public int rob(int[] nums) {
       int a=0;
       int b=0;
       for(int i:nums){
        int t=a;
        a=Math.max(a,b+i);
        b=t;
       }
       return a;
        
    }
}