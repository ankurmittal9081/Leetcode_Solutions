// Last updated: 9/16/2025, 9:32:54 AM
class Solution {
    public int[] dailyTemperatures(int[] arr) {

        int n=arr.length;
        int arr1[]=new int[n];
        ArrayDeque<Integer> st=new ArrayDeque<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();

            }
            if(st.isEmpty()){
                arr1[i]=0;
            }
            else{
                arr1[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr1;
        
    }
}