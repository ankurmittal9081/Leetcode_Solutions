// Last updated: 9/28/2025, 3:18:37 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        List<Integer> l=new ArrayList<>();
        // int sum=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                l.add(i);
            }
            
        }
        return l;
    }
    
}