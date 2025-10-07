// Last updated: 10/7/2025, 12:34:09 PM
class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int count=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-min<=k){
                continue;
            }
            else{
                count++;
                min=arr[i];
            }
        }
        return count+1;
    }
}