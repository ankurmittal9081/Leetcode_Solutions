// Last updated: 9/16/2025, 9:33:38 AM
class Solution {
    public int maximalSquare(char[][] matrix) {
        
    
        int r=matrix.length;
        int c=matrix[0].length;
        if (matrix == null || r == 0 || c == 0) {
            return 0;
        }
        int max=0;

        int arr1[]=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]=='1'){
                    arr1[j]+=1;
                }
                else{
                    arr1[j]=0;
                }
            }
            int area=histogram(arr1);
            max=Math.max(max,area);
        }
        return max;
        
    }

    static int histogram(int[] arr) {
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
            int side=Math.min(arr[i],width);
            int area=side*side;
            max=Math.max(max,area);
        }

        return max;

    }
}

