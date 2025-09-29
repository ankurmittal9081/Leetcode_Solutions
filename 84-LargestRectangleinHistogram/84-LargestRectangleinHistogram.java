// Last updated: 9/29/2025, 9:54:22 PM
class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int arr1[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        arr1[n]=0;
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr1.length;i++){

            while(!st.isEmpty() && arr1[i]<arr[st.peek()]){
                int h=arr1[st.pop()];
                int b=st.isEmpty()?i:i-st.peek()-1;
                int r=h*b;
                max=Math.max(max,r);
            }
            st.push(i);

        }
        return max;
        
    }
}