// Last updated: 9/16/2025, 9:32:42 AM
class Solution {
    public int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        // return fib(n-1)+fib(n-2);
        
        int arr[]=new int[31];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr[n];

    }




}