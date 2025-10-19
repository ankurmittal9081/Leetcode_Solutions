// Last updated: 10/19/2025, 10:47:03 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs.length == 0) return "";
        String s = strs[0];
        for (String str : strs) {
            if (str.length() < s.length()) s = str;
        }
        StringBuilder l = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) return l.toString();
            }
            l.append(c);
        }
        return l.toString();
    }
}