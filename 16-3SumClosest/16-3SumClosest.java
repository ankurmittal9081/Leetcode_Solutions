// Last updated: 10/13/2025, 9:29:53 PM
class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n=arr.length;
        int cl=arr[0]+arr[1]+arr[2];
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(Math.abs(sum-target)<Math.abs(cl-target))cl=sum;
                if(sum<target)l++;
                else if(sum>target) r--;
                else return sum;
            }
        }
        return cl;
    }
}