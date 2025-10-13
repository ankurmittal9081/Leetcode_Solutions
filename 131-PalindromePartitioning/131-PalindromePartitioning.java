// Last updated: 10/13/2025, 8:46:25 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>  l=new ArrayList<>();
        solve(l,s,0,new ArrayList<>());
        return l;
    }
    public void solve(List<List<String>> l,String s,int idx,ArrayList<String> curr){
        if(idx==s.length()){
           l.add( new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<s.length();i++){
            String sub=s.substring(idx,i+1);
            if(ispalin(sub)){
                curr.add(sub);
                solve(l,s,i+1,curr);
                curr.remove(curr.size()-1);
            }
        }

    }
    public boolean ispalin(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r){
           if( s.charAt(l++)!=s.charAt(r--)) return false;
        }
        return true;
    }
}