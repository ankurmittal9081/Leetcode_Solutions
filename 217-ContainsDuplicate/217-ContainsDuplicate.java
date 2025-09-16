// Last updated: 9/16/2025, 9:33:39 AM
class Solution {
    public boolean containsDuplicate(int[] arr) {
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]==arr[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
        
    }
}