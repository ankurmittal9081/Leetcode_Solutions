// Last updated: 9/16/2025, 9:32:35 AM
class Solution {
    public int maxDistance(int[] stalls, int k) {
         Arrays.sort(stalls);
        int l=1;
        int h=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isspace(stalls,k,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
        
    }
    
    public static boolean isspace(int arr[],int k,int mid){
        int c=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=mid){
                c++;
                last=arr[i];
            }
            
        }
        return c>=k;
    }
}