// Last updated: 9/16/2025, 9:34:21 AM
import java.util.ArrayDeque;

class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] prev = new int[n]; 
        int[] next = new int[n]; 

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&& arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                prev[i]=-1;
            }
            else{

                prev[i]=stack.peek();
            }
            stack.push(i);

        }

        while (!stack.isEmpty()) {
            stack.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=n;
            }
            else{
                next[i]=stack.peek();

            }
            stack.push(i);
            
        }


        int max=0;

        for(int i=0;i<n;i++){
            int width=next[i]-prev[i]-1;
            int area=arr[i]*width;
            max=Math.max(max,area);
        }

        return max;
    }
}
