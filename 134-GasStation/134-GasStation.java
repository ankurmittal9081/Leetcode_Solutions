// Last updated: 9/29/2025, 9:30:29 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int sum=0;
        int total=0;
        int s=0;
        for(int i=0;i<n;i++){
            sum+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(total<0){
                s=i+1;
                total=0;

            }
        }
        return sum>=0 ?s:-1;

    }
}