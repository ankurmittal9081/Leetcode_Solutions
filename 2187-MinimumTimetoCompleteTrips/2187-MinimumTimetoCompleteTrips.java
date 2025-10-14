// Last updated: 10/14/2025, 6:10:56 AM
class Solution {
    public long minimumTime(int[] arr, int tt) {
        long l=1;
        long h=(long) Arrays.stream(arr).min().getAsInt()*tt;

        long ans=0;
        while(l<h){
            long mid=l+(h-l)/2;
            long sum=0;
            for(int i:arr) sum+=mid/i;
            if(sum>=tt) h=mid;
            else l=mid+1;
        }
        return l;
    }
}