// Last updated: 9/16/2025, 9:33:04 AM
class Solution {
    public boolean detectCapitalUse(String s) {
        
        int u=0;
        for(char ch:s.toCharArray()){

            if(Character.isUpperCase(ch)){
                u++;
            }

        }

        if(u==s.length()){
            return true;
        }
        if(u==0){
            return true;
        }

        if(u==1 && Character.isUpperCase(s.charAt(0))){
            return true;
        }
        return false;
    }
}