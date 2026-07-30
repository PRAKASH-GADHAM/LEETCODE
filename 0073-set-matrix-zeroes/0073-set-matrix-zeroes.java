class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        HashSet<Integer> zeroes_rows = new HashSet<>() ;
        HashSet<Integer> zeroes_cols = new HashSet<>() ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    zeroes_rows.add(i) ;
                    zeroes_cols.add(j) ;
                }
            }
        }
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(zeroes_rows.contains(i) || zeroes_cols.contains(j)){
                    matrix[i][j] = 0 ;
                }
            }
        }
    }
}