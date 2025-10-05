// Last updated: 10/5/2025, 2:55:05 PM
class Solution {
    public boolean canPlaceFlowers(int[] fls, int m) {
        int max=0;
        int n=fls.length;
        int fi=-1;
        int li=-1;
        for(int i=0;i<fls.length;i++){
            if(fls[i]==0){
                continue;
            }

            else if(fi==-1){
                fi=i;
                li=i;
            }
            else{
                li=i;
            }
        }

        if(fi==-1)  {
            max=(n+1)/2;
        }   
        else{
            int left=fi;
            int right=n-1-li;
            max=left/2;
            max+=right/2;

            int c=0;
            for(int i=fi+1;i<=li-1;i++){
                if(fls[i]==0) c++;
                else {
                    max+=(c-1)/2;
                    c=0;
                }
            }
            max+=(c-1)/2;    
        }
        return m<=max;
    }
}