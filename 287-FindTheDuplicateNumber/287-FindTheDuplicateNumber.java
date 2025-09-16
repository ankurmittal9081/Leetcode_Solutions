// Last updated: 9/16/2025, 9:33:21 AM
class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int key:map.keySet()){
        //     if(map.get(key)!=1){
        //         return key;
        //     }
        // }

        // return -1;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
        
    }
}