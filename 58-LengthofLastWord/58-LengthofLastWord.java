// Last updated: 10/8/2025, 11:04:12 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
            int n=arr.length;
            String s1=arr[n-1];
           
            return s1.length();
    }
}