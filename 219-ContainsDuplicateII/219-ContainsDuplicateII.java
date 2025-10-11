// Last updated: 10/11/2025, 3:21:44 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length && j-i<=k;j++){
        //         if(nums[i]==nums[j]) return true;
        //     }

        // }
        // return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int p=map.get(nums[i]);
                if(i-p<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;

        //using hashset+sliding windoww
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])) return true;
        //     set.add(nums[i]);
        //     if(set.size()>k){
        //         set.remove(nums[i-k]);
        //     }
        // }
        // return false;
    }
}