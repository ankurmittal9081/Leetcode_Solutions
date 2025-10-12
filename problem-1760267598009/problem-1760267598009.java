// Last updated: 10/12/2025, 4:43:18 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n<1) return 0;
        Set<Integer> set=new TreeSet<>();
        for(int i:nums) set.add(i);
        List<Integer> l=new ArrayList<>(set);
        for(int i:l){
            System.out.println(i+" ");
        }
        int c=1;
        int max=1;
        for(int i=1;i<l.size();i++){
            if(l.get(i)-l.get(i-1)==1) c++;
            else c=1;
            max=Math.max(max,c);
        }

        return max;

    }
}