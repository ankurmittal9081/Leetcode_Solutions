// Last updated: 9/16/2025, 9:34:38 AM
class Solution {
    public int trap(int[] arr) {

        int n=arr.length;
        int l[]=new int[n];
        int r[]=new int[n];

        l[0]=arr[0];
        r[n-1]=arr[n-1];

        int res=0;

        for(int i=1;i<n;i++ ){
            l[i]=Math.max(l[i-1],arr[i]);
        }

        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],arr[i]);
        }

        for(int i=1;i<n-1;i++){

            int min=Math.min(l[i-1],r[i+1]);
            if(min>arr[i]){
                res+=min-arr[i];
            }

        }
        return res;
        
    }
}