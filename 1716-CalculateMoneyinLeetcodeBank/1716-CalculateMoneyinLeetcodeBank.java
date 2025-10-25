// Last updated: 10/25/2025, 9:05:57 PM
class Solution {
    public int totalMoney(int n) {
        int w=n/7;
        int d=n%7;
        int c=0;
    c+=28*w+7*(w*(w-1))/2;
        int s=w+1;
        for(int i=0;i<d;i++) c+=s+i;
        return c;

    }
}