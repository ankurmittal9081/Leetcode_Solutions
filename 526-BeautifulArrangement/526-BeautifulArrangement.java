// Last updated: 10/6/2025, 7:56:03 PM
class Solution {
    public int countArrangement(int n) {
        boolean arr[]=new boolean[n+1];
        return solve(1,n,arr);  
    }

    public static int solve(int pos,int n,boolean arr[]){
        if(pos>n) return 1;
        int c=0;
        for(int i=1;i<=n;i++){
            if(!arr[i]&&(i%pos==0||pos%i==0)){
                arr[i]=true;
                c+=solve(pos+1,n,arr);
                arr[i]=false;
            }

        }
        return c;
    }
}