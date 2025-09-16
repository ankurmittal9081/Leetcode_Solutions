// Last updated: 9/16/2025, 9:33:15 AM
class Solution {
    public static boolean isvowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch =='A'||ch 
        =='E'||ch=='I'||ch=='O'||ch=='U';
    }

    public String reverseVowels(String s) {
    char[] arr=s.toCharArray(); 

        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(!isvowel(arr[l])){
                l++;
            }
            else if(!isvowel(arr[r])){
                r--;
            }
            else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        return new String(arr);

    }
}