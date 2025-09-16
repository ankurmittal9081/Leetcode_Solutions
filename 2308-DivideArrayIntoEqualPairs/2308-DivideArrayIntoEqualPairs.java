// Last updated: 9/16/2025, 9:32:26 AM
class Solution {
    public boolean divideArray(int[] arr) {
        Arrays.sort(arr);

        for(int i=1; i<arr.length;i+=2){
            if((arr[i]^arr[i-1])!=0){
                return false;
            }
        }
        return true;
    }
}