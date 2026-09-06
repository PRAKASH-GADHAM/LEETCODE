class Solution {
    public boolean validTicTacToe(String[] board) {
        int x = 0, o = 0 ;
        for (String row : board)
            for(char c : row.toCharArray()){
                if (c == 'X') x++ ;
                else if (c == 'O') o++ ;
            }

        if(x != o && x != o + 1) return false ;

        boolean xWins = wins(board, 'X') ;
        boolean oWins = wins(board, 'O') ;

        if(xWins && oWins) return false ;
        if(xWins && x != o + 1) return false ;
        if(oWins && x != o) return false ;

        return true ;
    }

    private boolean wins(String[] board, char p) {
        for (int i = 0 ; i < 3 ; i++) {
            if (board[i].charAt(0) == p && board[i].charAt(1) == p && board[i].charAt(2) == p) return true ;
            if (board[0].charAt(i) == p && board[1].charAt(i) == p && board[2].charAt(i) == p) return true ;
        }
        if (board[0].charAt(0) == p && board[1].charAt(1) == p && board[2].charAt(2) == p) return true ;
        if (board[0].charAt(2) == p && board[1].charAt(1) == p && board[2].charAt(0) == p) return true ;
        return false ;
    }
}   