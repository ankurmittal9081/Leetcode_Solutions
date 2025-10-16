// Last updated: 10/16/2025, 10:31:58 AM
class Solution {
    public boolean isPalindrome(String s) {


        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");

        if(isvalid(s))return true;

        return false;
    }
    public static boolean isvalid(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)) return false; 
        }
        return true;
    }
}