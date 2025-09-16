// Last updated: 9/16/2025, 9:34:26 AM
class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int l=0;
        int m=0;
        int h=n-1;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }
        }



        
    }
}