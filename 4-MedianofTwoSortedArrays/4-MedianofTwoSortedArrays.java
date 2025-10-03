// Last updated: 10/3/2025, 12:51:50 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++){

            arr[i]=nums1[i];

        }

        for(int i=0;i<m;i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
       int t=n+m;
       if(t%2==1){
        return arr[t/2];
       }
       else{
        return (arr[t/2-1]+arr[t/2])/2.0;
       }

    }
}