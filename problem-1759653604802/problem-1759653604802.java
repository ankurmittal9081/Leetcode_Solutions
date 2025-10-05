// Last updated: 10/5/2025, 2:10:04 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int []inDeg = new int[n+1];
        int []outDeg = new int[n+1];
        for(int i=0; i<trust.length; i++) {
            inDeg[trust[i][1]]++;
            outDeg[trust[i][0]]++;
        }
        for(int i=1; i<=n;i++) {
            if(outDeg[i]==0 && inDeg[i]==(n-1)) return i;
        }
        return -1;
    }
}