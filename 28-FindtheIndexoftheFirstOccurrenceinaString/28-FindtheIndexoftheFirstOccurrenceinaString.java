// Last updated: 10/5/2025, 1:21:12 PM
class Solution {
    public int strStr(String s, String s1) {
        // return s.indexOf(s1);

        int n=s.length();
        int  m=s1.length();

        // for(int i=0;i<=n-m;i++){
        //     if(s.substring(i,i+m).equals(s1)){
        //         return i;
        //     }

        // }
        // return -1;

        if(m==0) return 0;
        int i=0;
        int j=0;
        while(i<n){
            if(s.charAt(i)==s1.charAt(j)){
                i++;
                j++;
                if(j==m) return i-m;
            }
            else {
                i=i-j+1;
                j=0;
            }
        }
        return -1;
    }
}