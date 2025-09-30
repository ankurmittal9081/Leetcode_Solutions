// Last updated: 9/30/2025, 7:36:21 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int top=0,down=n-1,left=0,right=n-1;
        int[][] arr = new int[n][n];
        int num=1;

        ArrayList<Integer> l=new ArrayList<>();
        while(top<=down&&left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=num++;
            }

            for(int i=top+1;i<=down;i++){
                arr[i][right]=num++;
            }

            for(int i=right-1;i>=left;i--){
                if(top==down) break;
                arr[down][i]=num++;
            }

            for(int i=down-1;i>=top+1;i--){
                if(left==right) break;
                arr[i][left]=num++;
            }
            top++;
            down--;
            left++;
            right--;
        }
        return arr;
    }
}