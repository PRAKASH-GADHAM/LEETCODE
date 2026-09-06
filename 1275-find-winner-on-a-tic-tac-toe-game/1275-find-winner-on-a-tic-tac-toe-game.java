class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length ;
        int[] count = new int[8] ; 

        for (int k = n - 1 ; k >= 0 ; k -= 2) {
            int i = moves[k][0] , j = moves[k][1] ;
            count[i]++ ;
            count[j + 3]++ ;
            if(i == j) count[6]++ ;
            if(i + j == 2) count[7]++ ;
            if(count[i] == 3 || count[j + 3] == 3 || count[6] == 3 || count[7] == 3) return k % 2 == 0 ? "A" : "B" ;
        }
        return n == 9 ? "Draw" : "Pending" ;
    }
}