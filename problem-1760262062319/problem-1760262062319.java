// Last updated: 10/12/2025, 3:11:02 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int p=1;
        int zeroes=0;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]==0) zeroes++;
            else p*=nums[i];            
        }

        for(int i=0;i<n;i++){
           if(zeroes>1){
            arr[i]=0;
           }
           else if(zeroes==1){
            if(nums[i]==0) arr[i]=p;
            else arr[i]=0;
           }
           else{
            arr[i]=p/nums[i];
           }
             
        }
        return arr;
    }
}  
