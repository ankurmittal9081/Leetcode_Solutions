// Last updated: 9/29/2025, 9:45:21 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int []arr = new int[matrix[0].length];
        int ans = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                if(matrix[i][j] == '0')arr[j] = 0;
                else arr[j]++;
            }
            ans = Math.max(ans, LH(arr));
        }
        return ans;
    }
    
    public static int LH(int[] heights) {
    int n = heights.length;
    int[] h = Arrays.copyOf(heights, n + 1); // Add sentinel
    Stack<Integer> st = new Stack<>();
    int maxArea = 0;

    for (int i = 0; i < h.length; i++) {
        while (!st.isEmpty() && h[i] < h[st.peek()]) {
            int height = h[st.pop()];
            int width = st.isEmpty() ? i : i - st.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        st.push(i);
    }

    return maxArea;
}

}