// Last updated: 9/16/2025, 9:34:31 AM
class Solution {
    public int[] plusOne(int[] arr) {
        int n=arr.length;
        for (int i=n-1;i>= 0;i--) {
            if (arr[i]<9) {
                arr[i]+=1; 
                return arr;
            }
            arr[i]=0; 
        }
        // int[] n1 = new int[n + 1];
        // n1[0] = 1; 
        // return n1;

         arr = new int[n + 1];  // This is unavoidable
        arr[0] = 1;
        return arr;
        
    }
}