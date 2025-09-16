// Last updated: 9/16/2025, 9:34:18 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr3[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m&& j<n){
            if(nums1[i]<nums2[j]){
                arr3[k]=nums1[i];
                i++;

            }
            else{
                arr3[k]=nums2[j];
                j++;
            }

            k++;

        }       

        while(i<m){
            arr3[k++]=nums1[i++];

        }
        while(j<n){
            arr3[k++]=nums2[j++];
        }
        for(int d=0;d<m+n; d++) {
            nums1[d]=arr3[d];
        }
    }

}