class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;

        for(int i = 0 ; i < n ; i++){
            int num = matrix[0][i] ;
            for(int j = 0 , k = i ; j < m && k < n ; j++ , k++){
                if(matrix[j][k] != num) return false ;
            }

        }

        for(int i = 1 ; i < m ; i++){
            int num = matrix[i][0] ;
            for(int j = i , k = 0 ; j < m && k < n ; j++ , k++){
                if(matrix[j][k] != num) return false ;
            }
        }
        return true ;
    }
}