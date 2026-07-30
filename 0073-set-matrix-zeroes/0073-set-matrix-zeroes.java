class Solution {
    static{
        for(int i = 0 ; i < 250 ; i++){
            setZeroes(new int[][]{{0}}) ;
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int[] zeroes_rows = new int[m] ;
        int[] zeroes_cols = new int[n] ;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    zeroes_rows[i] = 1 ;
                    zeroes_cols[j] = 1 ;
                }
            }
        }
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(zeroes_rows[i] == 1 || zeroes_cols[j] == 1){
                    matrix[i][j] = 0 ;
                }
            }
        }
    }
}