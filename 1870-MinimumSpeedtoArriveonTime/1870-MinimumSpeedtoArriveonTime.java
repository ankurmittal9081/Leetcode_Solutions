// Last updated: 9/27/2025, 6:07:02 AM
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        return sol(dist,hour);
    }
    public static int sol(int arr[],double k){
        int l=1;
        int h=(int)1e7;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(ispossible(arr,mid,k)){
                ans=mid;
                h=mid-1;

            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int arr[],int mid,double k){
        double ti=0.0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            double t=(double)arr[i]/mid;
            if(i!=n-1){
                ti+=Math.ceil(t);
            }
            else{
                ti+=t;
            }
            if(ti>k)return false;
        }
        return true;

    }
}