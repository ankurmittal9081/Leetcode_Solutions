// Last updated: 10/13/2025, 9:18:24 PM
class Solution {
    public int countArrangement(int n) {
        boolean arr[]=new boolean[n+1];
        return solve(1,n,arr);
    }
    public int solve(int p,int n,boolean arr[]){
        if(p>n) return 1;
        int c=0;
        for(int i=1;i<=n;i++){
            if(!arr[i]&&(p%i==0||i%p==0)){

            arr[i]=true;
            c+=solve(p+1,n,arr);
            arr[i]=false;
            }
        }
    return c;
    }
}