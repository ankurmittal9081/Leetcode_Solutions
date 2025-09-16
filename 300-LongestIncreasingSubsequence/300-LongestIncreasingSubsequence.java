// Last updated: 9/16/2025, 9:33:19 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:nums){
            int i=Collections.binarySearch(l,x);

            if(i<0){
                i=-(i+1);
            }
            if(i==l.size()){
                l.add(x);
            }
            else{
                l.set(i,x);
            }
        }
        return l.size();
        
    }
}