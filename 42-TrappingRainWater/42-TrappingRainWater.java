// Last updated: 9/25/2025, 2:30:44 PM
class Solution {
    public int trap(int[] arr) {

         int n=arr.length;

        int lmaxheight[]=new int [n];
        int rmaxheight[]=new int [n];
        
        lmaxheight[0]=0;

        for(int i=1;i<n;i++){
            lmaxheight[i]=Math.max(lmaxheight[i-1],arr[i-1]);
        }

        rmaxheight[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rmaxheight[i]=Math.max(rmaxheight[i+1],arr[i+1]);
        }

        int water=0;
        for(int i=0;i<n;i++){
            int minheight=Math.min(lmaxheight[i],rmaxheight[i]);
            if(minheight-arr[i]>0){
                water+=minheight-arr[i];
            }

        }
        return water;


    }
}