// Last updated: 9/16/2025, 9:33:48 AM
class Solution {
    public int findPeakElement(int[] arr) {
        int l=0;
        // int ans=-1;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                // ans=mid;
                // r=mid-1;
                r=mid;
            }
        }
        return l;
        
    }
}