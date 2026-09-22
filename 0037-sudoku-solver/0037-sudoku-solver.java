class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    static boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char k = '1';k <= '9';k++){
                        if(isSafe(board,i,j,k)){
                            board[i][j] = k;
                            if(solve(board)){
                                return true;
                            }else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isSafe(char[][] board,int row,int col,char k){
        for(int i=0;i<9;i++){
            if(board[i][col]==k) return false;
            if(board[row][i]==k) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==k) return false;
        }
        return true;
    }
}