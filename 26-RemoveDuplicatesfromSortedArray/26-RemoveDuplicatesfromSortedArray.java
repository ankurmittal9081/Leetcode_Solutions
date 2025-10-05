// Last updated: 10/5/2025, 1:01:01 PM
class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int n=arr.length;
        // int ans[]=new int[n];
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
                // i++;

            }
        }
        return i+1;
    }
}