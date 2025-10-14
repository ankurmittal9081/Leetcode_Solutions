// Last updated: 10/14/2025, 7:14:31 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if(n>m) return false;

        char arr[]=s1.toCharArray();

        Arrays.sort(arr);
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            char arr2[]=sub.toCharArray();
            Arrays.sort(arr2);
            
            if(Arrays.equals(arr,arr2))  return true;
        }

        return false;
    }
    
}