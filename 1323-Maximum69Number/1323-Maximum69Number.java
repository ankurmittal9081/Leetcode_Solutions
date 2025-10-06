// Last updated: 10/6/2025, 10:43:31 AM
class Solution {
    public int maximum69Number (int num) {
        char arr[]=String.valueOf(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6') {
                arr[i]='9';
            return Integer.parseInt(new String(arr));
            }
        }
        return num;
    }
}