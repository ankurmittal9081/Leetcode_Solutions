// Last updated: 10/13/2025, 10:07:35 PM
class Solution {
    public String answerString(String s,int t) {
        int n=s.length();
        String maxStr="";
        if(t==1){
            return s;
        }
        int c=n-(t-1);
        for(int i=0;i<n;i++){

            int end=Math.min(n,i+c);
            String sub=s.substring(i,end);
            if(sub.compareTo(maxStr)>0) maxStr=sub;
        }
        return maxStr;
        
    }
}