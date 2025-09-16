// Last updated: 9/16/2025, 9:33:16 AM
class Solution {
    public void reverseString(char[] s) {
        int r=s.length-1;
        int l=0;
        
        while(l<=r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        
    }
}