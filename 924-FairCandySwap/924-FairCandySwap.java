// Last updated: 9/16/2025, 9:32:44 AM
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int suma=0;
        int sumb=0;
        for(int i:A){
            suma+=i;
        }
        for(int i:B){
            sumb+=i;
        }
        int diff=(suma-sumb)/2;
        Arrays.sort(A);

        for(int i:B){
            int x=i+diff;
            if(isbinary(A,x)){
                return new int[]{x,i};
            }
        }
        return new int[]{-1,-1};

        
    }
    static boolean isbinary(int arr[],int t){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                return true;
            }
            else if(arr[mid]>t){
                r=mid-1;
            }
            else{
                l=mid+1;

            }
        }
        return false;
    }
}