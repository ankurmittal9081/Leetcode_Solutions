// Last updated: 9/16/2025, 9:33:52 AM
class Solution {
    public int findMin(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>arr[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return arr[l];
        
    }
}