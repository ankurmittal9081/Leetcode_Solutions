// Last updated: 10/14/2025, 6:47:58 AM
class Solution {
    public int minPairSum(int[] arr) {
        int l=0;
        int n=arr.length;
        Arrays.sort(arr);
        int r=n-1;
        int max=0;
        while(l<r){
            int sum=arr[l++]+arr[r--];
            max=Math.max(max,sum);
        }
            return max;
    }
}