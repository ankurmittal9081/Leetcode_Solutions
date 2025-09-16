// Last updated: 9/16/2025, 9:32:30 AM
class Solution {
    public boolean checkIfPangram(String s) {
        // Set<Character> set=new HashSet<>();
        // for(char ch:s.toCharArray()){
        //     if(ch>='a'&&ch<='z'){
        //         set.add(ch);
        //     }

        // }
        // return set.size()==26;

        for(char i='a';i<='z';i++){
            if(s.indexOf(i)==-1){
                return false;
            }
        }
        return true;
        
    }
}