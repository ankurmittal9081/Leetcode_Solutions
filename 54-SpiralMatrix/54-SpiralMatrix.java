// Last updated: 9/30/2025, 7:31:09 AM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         int n=arr.length;
        int m=arr[0].length;
        int top=0,down=n-1,left=0,right=m-1;
        ArrayList<Integer> l=new ArrayList<>();
        while(top<=down&&left<=right){
            for(int i=left;i<=right;i++){
                l.add(arr[top][i]);
            }

            for(int i=top+1;i<=down;i++){
                l.add(arr[i][right]);
            }

            for(int i=right-1;i>=left;i--){
                if(top==down) break;
                l.add(arr[down][i]);
            }

            for(int i=down-1;i>=top+1;i--){
                if(left==right) break;
                l.add(arr[i][left]);
            }
            top++;
            down--;
            left++;
            right--;
        }
        return l;

    }
}