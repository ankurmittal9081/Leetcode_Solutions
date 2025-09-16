// Last updated: 9/16/2025, 9:34:40 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
        

        
    }
    static int first(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid]>t){
                r=mid-1;            
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }

    static int last(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]>t){
                r=mid-1;            
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}