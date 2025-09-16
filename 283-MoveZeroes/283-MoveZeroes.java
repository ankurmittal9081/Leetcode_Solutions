// Last updated: 9/16/2025, 9:33:23 AM
class Solution {
    public void moveZeroes(int[] arr) {
        
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l++;
            }
        }
    }
}