class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        int[][] res = new int[n][n] ;
        for(int i = 0 ; i < n ; i++){
            int j = n - 1 ;
            while(j >= 0){
                res[i][n - j - 1] = matrix[j][i] ;
                j-- ;
            }      
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = res[r][c];
            }
        }

    }
}