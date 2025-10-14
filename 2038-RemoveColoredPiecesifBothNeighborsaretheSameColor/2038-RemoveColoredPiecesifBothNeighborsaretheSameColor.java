// Last updated: 10/14/2025, 7:17:25 AM
class Solution {
    public boolean winnerOfGame(String s) {
        int a=0;
        int b=0;
        int n=s.length();
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='A'|| s.charAt(i-1)=='A'||s.charAt(i+1)=='A')a++;
            if(s.charAt(i)=='B'|| s.charAt(i-1)=='B'||s.charAt(i+1)=='B')b++;
        }
        return a>b;
    }
}