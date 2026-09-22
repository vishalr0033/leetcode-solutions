class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        fun(0,board,ans,n);
        return ans;
    }
    static boolean isSafe(int row,int col ,char[][] board,int n){
        int dr = row;
        int dc = col;
        while(col >= 0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row = dr;
        col = dc;
        while(row >= 0 && col >= 0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row = dr;
        col = dc;
        while(row < n && col >=0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
    void fun(int col,char[][] board,List<List<String>> list,int n){
        if(col==n){
            List<String> li = new ArrayList<>();
            for(int i=0;i<n;i++){
                li.add(new String(board[i]));
            }
            list.add(li);
            return;
        }
        for(int row = 0; row < n; row++){
            if(isSafe(row,col,board,n)){
                board[row][col] = 'Q';
                fun(col+1,board,list,n);
                board[row][col] = '.';
            }
        }
    }
}