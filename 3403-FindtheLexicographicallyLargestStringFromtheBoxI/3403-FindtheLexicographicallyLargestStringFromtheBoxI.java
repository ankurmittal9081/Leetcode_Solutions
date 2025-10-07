// Last updated: 10/7/2025, 10:35:28 AM
class Solution {
    public String answerString(String s,int t) {
        String maxStr="";
        if(t==1){
            return s;
        }
        int formed=s.length()-t+1;
        for(int i=0;i<s.length();i++){
            int canTakeLen=Math.min(formed,s.length()-i);
            String newStr=s.substring(i,i+canTakeLen);
            if(newStr.compareTo(maxStr)>0){
                maxStr=newStr;
            }
        }
        return maxStr;
        
    }
}