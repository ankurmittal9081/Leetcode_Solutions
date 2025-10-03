// Last updated: 10/3/2025, 11:31:14 AM
class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                   boolean ans= solve(board,i,j,n,m,word,0);

                   if(ans) return true;
                }
            }
        }
        return false;
    }
    public static boolean solve(char arr[][],int cr,int cc,int er,int ec,String word,int i){
        

        if(i==word.length()) return true;
        if(cr<0 ||cc<0||cr>=er || cc>=ec || arr[cr][cc]=='#') return false;
            char ch=word.charAt(i);
            if(ch==arr[cr][cc]){
                arr[cr][cc]='#';

                boolean up=solve(arr,cr-1,cc,er,ec,word,i+1);
                if(up==true) return true;
                boolean down=solve(arr,cr+1,cc,er,ec,word,i+1);
                if(down==true) return true;
                boolean left=solve(arr,cr,cc-1,er,ec,word,i+1);
                if(left==true) return true;
                boolean right=solve(arr,cr,cc+1,er,ec,word,i+1);
                if(right==true) return true;
                arr[cr][cc]=ch;
                return false;
            }

            else{
                return false;
            }


        // return true;
            
        
    }
}