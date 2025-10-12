// Last updated: 10/12/2025, 5:30:48 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int c=1;
        int maxi=1;
        int max=Integer.MIN_VALUE;
        if(n<1) return 0;

        Set<Integer> set=new TreeSet<>();
        for(int i:nums) set.add(i);

       for(int i:set){
        if(max!=Integer.MIN_VALUE && i==max+1){
            c++;
        }
        else{
            c=1;
        }
        maxi=Math.max(maxi,c);
        max=i;
       }
       return maxi;

        

    }
}