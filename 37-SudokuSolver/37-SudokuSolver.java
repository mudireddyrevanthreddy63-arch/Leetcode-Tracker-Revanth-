// Last updated: 11/08/2026, 14:20:45
class Solution {
    boolean isValid(char[][] board,int i , int j,char c,int n){
        for(int col = 0;col<n;col++)
            if(board[i][col]==c)
               return false;
        for(int row = 0;row<n;row++)
            if(board[row][j]==c)
                return false;

        int rs=i/3*3;
        int cs = j/3*3;
        for(int row = rs; row<rs+3;row++){
            for(int col = cs;col<cs+3;col++){
                if(board[row][col]==c)
                return false;
            }
        }
        return true;       
    }
    boolean solve(char[][] board, int n){
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(board[i][j]=='.'){
                    for(char c = '1'; c<= '9';c++){
                        if(isValid(board,i,j,c,n)){
                            board[i][j] = c;
                            if(solve(board,n))
                             return true;
                            else
                             board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        int n = board.length;
        solve(board,n);
    }
}