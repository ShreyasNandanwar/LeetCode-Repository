class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                char num = board[i][j];
                board[i][j] = '.';

                if(isTrue(board, i, j, num)==false) return false;
                board[i][j] = num;
            }
        }
        return true;
    }

    public boolean isTrue(char[][] board, int row, int column, char num){
        for(int j=0; j<9; j++){
            if(board[row][j] == num) return false;
        }

        for(int i=0; i<9;i++){
            if(board[i][column]==num) return false;
        }

        int subr = (row/3)*3;
        int subcol = (column/3)*3;
        for(int i= subr; i<subr+3; i++){
            for(int j= subcol; j<subcol+3; j++){
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }
}
