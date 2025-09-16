// Last updated: 9/16/2025, 9:31:49 AM
class Solution {
    public String smallestNumber(String pattern) {

        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        int n=pattern.length();

        int ans=1;
        for(int i=0;i<=n;i++){
            st.push(ans++);
            if(i==n || pattern.charAt(i)=='I'){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }
        }
        return sb.toString();

        
    }
}