// Last updated: 9/27/2025, 9:12:27 PM
class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        // int ans[]=new int[n+m];

        for(int i=0;i<n;i++){
            arr1[m+i]=arr2[i];
        }
        Arrays.sort(arr1);
        // for(int i=0;i<n;i++){
        //     ans[i]=arr2[i];
        // }

        
    }
}