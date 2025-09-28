// Last updated: 9/28/2025, 2:49:42 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int c=0;
        
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
                max=Math.max(max,c);
            }
            else{
                c=0;
            }
        }
        return max;
    }
}