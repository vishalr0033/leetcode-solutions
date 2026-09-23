class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set s = new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch!='.'){
                    if(!s.add(ch+"is r"+i)||
                    !s.add(ch+"is c"+j) ||
                    !s.add(ch+"b"+i/3+"."+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}