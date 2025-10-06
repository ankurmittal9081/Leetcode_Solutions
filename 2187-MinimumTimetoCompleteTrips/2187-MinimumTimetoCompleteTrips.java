// Last updated: 10/6/2025, 10:25:27 PM
class Solution {
    public long minimumTime(int[] arr, int tt) {
         long l=1;
         long h=(long)Arrays.stream(arr).min().getAsInt()*tt;

         while(l<h){
            long mid=l+(h-l)/2;

            long sum=0;

            for(int i:arr){
                sum+=mid/i;
            }
            if(sum>=tt){
                h=mid;
            }
            else l=mid+1;
         }
         return l;
    }
}