// Last updated: 9/16/2025, 9:34:48 AM
class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);
        
    }
}