// Last updated: 10/8/2025, 11:38:49 AM
class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int c=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            int diff=arr[i]-min;
            if(diff<=k){
                continue;
            }
            else{
                c++;
                min=arr[i];
            }
        }
        return c+1;
    }
}