// Last updated: 9/28/2025, 2:28:37 PM
class Solution {
    public void duplicateZeros(int[] arr) {
        
        int n=arr.length;
        int z=0;
        for(int i:arr){
            if(i==0) z++;
        }
        int i=n-1;
        int j=n+z-1;
        while(i>=0)
        {
            if(arr[i]!=0)
            {
                if(j<n) 
                {
                    arr[j]=arr[i];
                }
                    j--;
            }
            else
            {
                if(j<n)
                {
                    arr[j]=0;
                }
                j--;
            
                if(j<n)
                {
                    arr[j]=0;
                }
                    j--;
            }
            i--;
        }
    }
}