// Last updated: 10/4/2025, 3:02:55 PM
class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res=res<<1;
            res=res|(n&1);
            n=n>>1;
        }
        return res;
    }
}