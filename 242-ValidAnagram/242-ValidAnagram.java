// Last updated: 10/11/2025, 3:35:44 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char arr[]=s.toCharArray();
        char arr1[]=t.toCharArray();
        int n=arr.length;
        int m=arr1.length;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(n!=m) return false;

        for(int i=0;i<n;i++){
            if(arr[i]!=arr1[i]) return false;
        }
        return true;
    }
}