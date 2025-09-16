// Last updated: 9/16/2025, 9:33:08 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        // Arrays.sort(nums);
        int l=0;
        // int h=stalls[stalls.length-1]-stalls[0];
        int h=0;
        for (int num : nums) {
            l = Math.max(l, num);
            h += num;
        }
        int ans=h;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(isspace(nums,k,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
    
    public static boolean isspace(int arr[],int k,int max){
        int count=1;
        int sum=0;
        for (int i : arr) {
            if (sum + i > max) {
                count++;
                sum = i;
                if (count > k) return false; // too many parts
            } else {
                sum += i;
            }
        }
        return true; 
    }
}