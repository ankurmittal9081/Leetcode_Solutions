// Last updated: 9/16/2025, 9:32:36 AM
class Solution {
    public int minDays(int[] arr, int m, int k) {
        int l=0;
        int ans=-1;
        int h=Arrays.stream(arr).max().getAsInt();
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(arr,k,m,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;

    }

    public static boolean check(int arr[],int k,int m,int d){
        int c=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=d){
                c+=1;
            }
            else{
                b+=c/k;
                c=0;
            }
        }
        b+=c/k;
        return b>=m;

    }
}