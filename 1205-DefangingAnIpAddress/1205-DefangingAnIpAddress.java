// Last updated: 9/16/2025, 9:32:38 AM
class Solution {
    public String defangIPaddr(String s) {
        
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='.'){
                sb.append("[.]");
                // ch=[.];
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    
    }
}