class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        fun(0,board,list,n);
        return list;
    }
    static void fun(int col,char[][] board,List<List<String>> list,int n){
        if(col==board.length){
            List<String> li = new ArrayList<>();
            for(int i=0;i<n;i++){
                li.add(new String(board[i]));
            } 
            list.add(li);
            return;
            
        }
        for(int row = 0;row < n;row++){
                if(isValid(row,col,board,n)){
                    board[row][col] = 'Q';
                    fun(col+1,board,list,n);
                    board[row][col] = '.';
                }
            }
    }
    static boolean isValid(int r,int c,char[][] board,int n){
        int rd = r;
        int cd = c;
        while(r >= 0  && c >= 0){
            if(board[r][c]=='Q') return false;
            r--;
            c--;
        }
        r = rd;
        c = cd;
        while(c >= 0){
            if(board[r][c]=='Q') return false;
            c--;
        }
        r = rd;
        c = cd;
        while(r < n && c >= 0){
            if(board[r][c]=='Q') return false;
            r++;
            c--;
        } 
        return true;
    }
}