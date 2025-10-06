// Last updated: 10/6/2025, 6:26:10 PM
class Solution {
    List<List<String>> l=new ArrayList<>();
    public List<List<String>> partition(String s) {
        solve(s,0,new ArrayList<>());
        return l;
    }

    public void solve(String s,int index,List<String> curr){


            if(index==s.length()) 
            {
                l.add(new ArrayList<>(curr));
                return ;
            }

            for(int i=index;i<s.length();i++){
                String sub=s.substring(index,i+1);
                if(ispalindrome(sub)){
                    curr.add(sub);
                    solve(s,i+1,curr);
                    curr.remove(curr.size()-1);
                }
            }
    }

    public boolean ispalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)) return false;
        }

        return true;
    }
}