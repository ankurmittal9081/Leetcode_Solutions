// Last updated: 9/28/2025, 9:42:44 PM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int n=set.size();
        int c=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set1=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                set1.add(nums[j]);
                if(set1.size()==n){
                    c++;
                }
            }
        }
        return c;
    }
}