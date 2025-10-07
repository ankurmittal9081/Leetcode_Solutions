// Last updated: 10/7/2025, 11:50:47 AM
class Solution {
    public boolean winnerOfGame(String s) {
        // int a=0;
        // int b=0;
        // int i=0;
        // int n=s.length();
        // while(i<n){
        //     char c=s.charAt(i);
        //     int co=0;
        //     while(i<n && s.charAt(i)==c){
        //          co++;
        //         i++;


        //     }
        //     if(co>=3){
        //         if(c=='A') a+=co-2;
        //         else b+=co-2;
        //     }
        // }
        // return a>b;

        int a=0;
        int b=0;
        int n=s.length();
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='A'&& s.charAt(i-1)=='A'&& s.charAt(i+1)=='A')a++;
            if(s.charAt(i)=='B'&& s.charAt(i-1)=='B'&& s.charAt(i+1)=='B')b++;


        }
        return a>b;


    }
}