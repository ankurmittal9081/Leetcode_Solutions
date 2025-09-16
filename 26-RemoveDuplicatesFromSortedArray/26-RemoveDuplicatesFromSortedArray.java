// Last updated: 9/16/2025, 9:34:44 AM
class Solution {
    public int removeDuplicates(int[] arr) {
        // HashSet<Integer> set=new HashSet<>();

        int c=1;

       for(int i=1; i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
            arr[c]=arr[i];
            c++;
        }

       }
        return c;
    }
}