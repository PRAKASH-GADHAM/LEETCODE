class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length ;

        for(int i = 0, j = n - 1 ; i < n ; i++, j--){
            if(grid[i][i] == 0) return false ;
            if(grid[i][j] == 0) return false ;

            for(int k = 0 ; k < n ; k++){
                if(k != i && k != j){
                    if (grid[i][k] != 0) return false ;
                }
            }
        }
        return true ;
    }
}