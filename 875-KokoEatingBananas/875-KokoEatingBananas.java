// Last updated: 9/26/2025, 11:59:14 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return sol(piles,h);
        
    }
    public static int sol(int arr[],int h){
        

        int l=1;
        int hi=0;

        for(int i:arr) hi=Math.max(hi,i);
        int ans=0;
        while(l<=hi){
            int speed=l+(hi-l)/2;
            if(ispossible(arr,h,speed)==true){
                ans=speed;
                hi=speed-1;
            }
            else{
                l=speed+1;
            }

        }
        return ans;
    }

    public static boolean ispossible(int arr[],int h,int speed){
        int time=0;
        for(int i=0;i<arr.length;i++){
            if(speed>=arr[i]){
                time+=1;
            }
            else{
                if(arr[i]%speed==0){
                    time+=arr[i]/speed;
                }
                else{
                    time+=(arr[i]/speed)+1;
                }
            }
            if(time>h){
                return false;
            }
        }
        return true;
    }
}