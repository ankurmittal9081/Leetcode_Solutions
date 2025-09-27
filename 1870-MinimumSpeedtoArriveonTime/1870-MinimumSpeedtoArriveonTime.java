// Last updated: 9/27/2025, 6:17:04 AM
class Solution {
    public boolean find(int t,int[] dict,double hour){
        double tot=0;
        for(int i=0;i<dict.length;i++){
            if(i==dict.length-1) tot+=dict[i]/(double)t;
            else if(  dict[i]%t!=0){
                tot+=dict[i]/t+1;
            }
            else{
                tot+=dict[i]/t;
            }
        }
        System.out.println(tot);
        return tot<=hour;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
    int  n= dist.length;

    int lo=1,hi=(int)1e7;
    int ans=-1;
    while(lo<=hi){
        int mid=(hi-lo)/2+lo;
       if(find(mid,dist,hour)){
         ans =mid;
         hi=mid-1;
       }
       else lo=mid+1;
    }
    return ans;
    }
}