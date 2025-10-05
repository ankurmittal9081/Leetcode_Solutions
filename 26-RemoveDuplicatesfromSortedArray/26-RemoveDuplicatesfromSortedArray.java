// Last updated: 10/5/2025, 1:08:01 PM
class Solution {
    public int removeDuplicates(int[] arr) {
        // int i=0;
        // int n=arr.length;
        // for(int j=1;j<n;j++){
        //     if(arr[j]!=arr[i]){
        //         i++;
        //         arr[i]=arr[j];

        //     }
        // }
        // return i+1;
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int i=0;
        for(int j:set){
            arr[i++]=j;
        }
        return set.size();
    }
}