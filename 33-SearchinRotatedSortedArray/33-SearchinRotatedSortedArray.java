// Last updated: 9/29/2025, 10:34:02 PM
class Solution {
    public int search(int[] arr ,int target) {
        int l=0;
        int n=arr.length;
        int r=arr.length-1;
        // int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>=arr[l]){
                if(arr[l]<=target&&target<arr[mid]){
                    // ans=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[r]){
                    // ans=mid;
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        
        return -1;
    }
}