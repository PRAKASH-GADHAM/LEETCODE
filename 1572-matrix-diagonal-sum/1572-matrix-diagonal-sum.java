class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length ;
        int Trace = 0 ;
        int RevTrace = 0 ;

        for(int i = 0 , j = n - 1 ; i < n && j >= 0 ; i++ , j--){
            Trace += mat[i][i] ;
            RevTrace += mat[i][j] ;
        }

        if(n % 2 != 0){
            int m = n / 2 ;
            return Trace + RevTrace - mat[m][m] ;
        }
        return Trace + RevTrace ;
    }
}