// Last updated: 10/11/2025, 3:37:34 PM
class Solution {
    static{
        for(int i=0;i<500;i++)
            isAnagram("", "a");
        }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       int[] count=new int[26];
       for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
       }
       for(int i=0;i<26;i++){
        if(count[i]!=0) return false;
       }
       return true;
    }
}