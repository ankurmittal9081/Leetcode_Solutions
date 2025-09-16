// Last updated: 9/16/2025, 9:34:51 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n=s.length();
        int f=0;
        int e=0;

        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            while(set.contains(ch)){
                set.remove(s.charAt(f));
                f++;
            }
            set.add(ch);
            e=Math.max(e,i-f+1);
        }
        return e;
        
    }
}