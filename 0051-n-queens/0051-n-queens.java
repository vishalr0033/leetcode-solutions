class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][]board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> ans = new ArrayList<>();
        fun(0,ans,board,n);
        return ans;
    }
    static void fun(int col,List<List<String>> ans,char[][] board,int n){
        if(col==board.length){
            List<String> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }
        for(int row = 0 ; row < n;row++ ){
            if(isSafe(row,col,board,n)){
                board[row][col] = 'Q';
                fun(col+1,ans,board,n);
                board[row][col] = '.';
            }
        }
    }
    static boolean isSafe(int row,int col,char[][] board,int n){
        int dr = row;
        int dc = col;
        while(row >= 0 && col >= 0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row = dr;
        col = dc;
        while(col >= 0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row = dr;
        col = dc;
        while(row < n && col >= 0){
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }
        return true;
    }
}