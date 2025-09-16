// Last updated: 9/16/2025, 9:33:03 AM
class Solution {
    public int singleNonDuplicate(int[] arr) {
        // int l=0;
        // int r=arr.length-1;
        // while(l<r){
        //     int mid=l+(r-l)/2;
        //     if(mid%2==1){
        //         mid--;
        //     }
        //     if(arr[mid]==arr[mid+1]){
        //         l=mid+2;

        //     }
        //     else{
        //         r=mid;
        //     }      
        // }
        // return arr[l];
        // int an = 0;
        // for(int num : arr) {
        //     an ^= num;
        // } return an;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }   
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }
        return -1;
    }
}