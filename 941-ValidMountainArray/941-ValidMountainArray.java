// Last updated: 9/28/2025, 12:48:00 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n=arr.length;
        if(n<3){
            return false;
        }
        
        int max=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[max]){
                max=i;
            }

        }

        if(max==0 || max==n-1){
            return false;
        }

        for(int i=0;i<max;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }

        }

        for(int i=max;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }

        return true;
    }
}