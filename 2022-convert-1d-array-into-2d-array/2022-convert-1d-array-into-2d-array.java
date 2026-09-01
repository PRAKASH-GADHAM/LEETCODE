class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m * n < original.length || m * n > original.length) return new int[][]{} ;
        int[][] arr = new int[m][n] ;
        int k = 0 ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(k < original.length){
                    arr[i][j] = original[k] ;
                    k++ ;
                }
            }
        }
        return arr ;
    }
}