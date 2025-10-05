// Last updated: 10/5/2025, 3:25:53 PM
class Solution {
    public String makeGood(String s) {

        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int n=sb.length();
            if(n>0 && (sb.charAt(n-1)+32==ch|| sb.charAt(n-1)-32==ch )){
                sb.deleteCharAt(n-1);
            }
            else{
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}